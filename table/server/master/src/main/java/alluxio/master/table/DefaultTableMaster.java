/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.master.table;

import alluxio.Constants;
import alluxio.Server;
import alluxio.clock.SystemClock;
import alluxio.grpc.GrpcService;
import alluxio.grpc.ServiceType;
import alluxio.grpc.table.ColumnStatisticsInfo;
import alluxio.grpc.table.ColumnStatisticsList;
import alluxio.grpc.table.Constraint;
import alluxio.grpc.table.Partition;
import alluxio.master.CoreMaster;
import alluxio.master.CoreMasterContext;
import alluxio.master.file.FileSystemMaster;
import alluxio.master.journal.DelegatingJournaled;
import alluxio.master.journal.Journaled;
import alluxio.master.journal.JournaledGroup;
import alluxio.master.journal.checkpoint.CheckpointName;
import alluxio.master.table.transform.TransformManager;
import alluxio.table.common.transform.TransformDefinition;
import alluxio.table.common.transform.TransformPlan;
import alluxio.util.executor.ExecutorServiceFactories;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This table master manages catalogs metadata information.
 */
public class DefaultTableMaster extends CoreMaster
    implements TableMaster, DelegatingJournaled {
  private static final Logger LOG = LoggerFactory.getLogger(DefaultTableMaster.class);
  private static final Set<Class<? extends Server>> DEPS = ImmutableSet.of(FileSystemMaster.class);

  private final AlluxioCatalog mCatalog;
  private final TransformManager mTransformManager;
  private final JournaledGroup mJournaledComponents;

  /**
   * Constructor for DefaultTableMaster.
   *
   * @param context core master context
   */
  public DefaultTableMaster(CoreMasterContext context) {
    super(context, new SystemClock(),
        ExecutorServiceFactories.cachedThreadPool(Constants.TABLE_MASTER_NAME));
    mCatalog = new AlluxioCatalog();
    mTransformManager = new TransformManager(this::createJournalContext, mCatalog);
    mJournaledComponents = new JournaledGroup(Lists.newArrayList(mCatalog, mTransformManager),
        CheckpointName.TABLE_MASTER);
  }

  @Override
  public boolean attachDatabase(String dbName, String dbType, Map<String, String> configuration)
      throws IOException {
    return mCatalog.attachDatabase(createJournalContext(), dbType, dbName, configuration);
  }

  @Override
  public boolean detachDatabase(String dbName)
      throws IOException {
    return mCatalog.detachDatabase(createJournalContext(), dbName);
  }

  @Override
  public List<String> getAllDatabases() throws IOException {
    return mCatalog.getAllDatabases();
  }

  @Override
  public List<String> getAllTables(String databaseName) throws IOException {
    return mCatalog.getAllTables(databaseName);
  }

  @Override
  public Table getTable(String dbName, String tableName) throws IOException {
    return mCatalog.getTable(dbName, tableName);
  }

  @Override
  public List<ColumnStatisticsInfo> getTableColumnStatistics(String dbName, String tableName,
      List<String> colNames) throws IOException {
    return mCatalog.getTableColumnStatistics(dbName, tableName, colNames);
  }

  @Override
  public List<Partition> readTable(String dbName, String tableName,
      Constraint constraint) throws IOException {
    return mCatalog.readTable(dbName, tableName, constraint);
  }

  @Override
  public Map<String, ColumnStatisticsList> getPartitionColumnStatistics(String dbName,
      String tableName, List<String> partNamesList, List<String> colNamesList) throws IOException {
    return mCatalog.getPartitionColumnStatistics(dbName, tableName, partNamesList, colNamesList);
  }

  @Override
  public long transformTable(String dbName, String tableName, String definition)
      throws IOException {
    TransformDefinition transformDefinition = TransformDefinition.parse(definition);
    Table table = getTable(dbName, tableName);
    List<TransformPlan> plans = table.getTransformPlans(transformDefinition);
    return mTransformManager.execute(dbName, tableName, plans);
  }

  @Override
  public Set<Class<? extends Server>> getDependencies() {
    return DEPS;
  }

  @Override
  public String getName() {
    return Constants.TABLE_MASTER_NAME;
  }

  @Override
  public Map<ServiceType, GrpcService> getServices() {
    Map<ServiceType, GrpcService> services = new HashMap<>();
    services.put(ServiceType.TABLE_MASTER_CLIENT_SERVICE,
        new GrpcService(new TableMasterClientServiceHandler(this)));
    return services;
  }

  @Override
  public void start(Boolean isLeader) throws IOException {
    super.start(isLeader);
    if (isLeader) {
      mTransformManager.start(getExecutorService(), mMasterContext.getUserState());
    }
  }

  @Override
  public void stop() throws IOException {
    super.stop();
  }

  @Override
  public void close() throws IOException {
    super.close();
  }

  @Override
  public Journaled getDelegate() {
    return mJournaledComponents;
  }
}
