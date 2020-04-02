package utils;

import java.sql.*;
import java.util.*;

public class DataConnection {
  private Connection appConn;
  private Connection appConnForRefund;

  private List<PreparedStatement> preparedStmtList = new ArrayList<>();

  private static DataConnection instance;

  public static synchronized DataConnection getInstance() throws Exception {
    if (instance == null) {
      instance = new DataConnection();
    }
    return instance;
  }

  private static Connection makeConnection(String dbName) throws Exception {
    Properties props = ResourceUtil.getAppProps();

    String driver = (String) props.get("db." + dbName + ".driver");
    if (driver == null || driver.isEmpty()) {
      throw new Exception("No [db." + dbName + ".driver] property in " + ResourceUtil.RESOURCE_NAME);
    }

    String url = (String) props.get("db." + dbName + ".url");
    if (url == null || url.isEmpty()) {
      throw new Exception("No [db." + dbName + ".url] property in " + ResourceUtil.RESOURCE_NAME);
    }

    String user = (String) props.get("db." + dbName + ".user");
    if (user == null || user.isEmpty()) {
      throw new Exception("No [db." + dbName + ".user] property in " + ResourceUtil.RESOURCE_NAME);
    }

    String password = (String) props.get("db." + dbName + ".password");

    Class.forName(driver);
    return DriverManager.getConnection(url, user, password);
  }

  public synchronized Connection getAppConn() throws Exception {
    if (appConn == null) {
      appConn = makeConnection("app");
    }
    return appConn;
  }

  public synchronized Connection getAppConnForRefund() throws Exception {
    if (appConnForRefund == null) {
      appConnForRefund = makeConnection("app");
    }
    return appConnForRefund;
  }

  public static Map<String, Integer> fetchColumnMap(ResultSet rs) throws Exception {
    Map<String, Integer> columnMap = new HashMap<>();
    ResultSetMetaData rsMeta = rs.getMetaData();
    int countColumn = rsMeta.getColumnCount();
    for (int columNo = 1; columNo < countColumn + 1; columNo++) {
      columnMap.put(rsMeta.getColumnName(columNo), columNo);
    }
    return columnMap;
  }

  public void addPreparedStmt(PreparedStatement pstmt) {
    preparedStmtList.add(pstmt);
  }

  public static void close(Connection conn, Statement stmt, ResultSet rs) {
    try {
      if (rs != null) {
        rs.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      if (stmt != null) {
        stmt.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    try {
      if (conn != null) {
        conn.close();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public void close() {
    for (PreparedStatement eachStmt : preparedStmtList) {
      close(null, eachStmt, null);
    }
    close(appConn, null, null);
    close(appConnForRefund, null, null);
  }
}
