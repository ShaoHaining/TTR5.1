package com.yan.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DBConn {
	private static Connection conn = null;

	private DBConn() {
	}

	public static Connection getConnection() throws Exception {
		if (conn == null || conn.isClosed()) {
			new SQLServerDriver();
			String url = "jdbc:sqlserver://49.235.167.254:3306;DatabaseName=root";
			conn = DriverManager.getConnection(url, "root", "admin@123");
		}
		return conn;
	}

	public static void closeConnection() throws Exception {
		if (conn != null && !conn.isClosed())
			conn.close();
	}
	public static void main(String[] args)throws Exception {
		conn=getConnection();
		System.out.println(conn);
	}
}