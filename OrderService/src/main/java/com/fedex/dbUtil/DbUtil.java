package com.fedex.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class DbUtil {
	public static Connection conn;

	public static Connection getConnection() {
		try {

		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}

	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}