package org.ITstep.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private final static String DB_URL = "jdbc.postgresql://localhost:5432/TestDB";
	private final static String DB_USERNAME = "postgres";
	private final static String DB_USERPASSWORD = "sherlock1058";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_USERPASSWORD);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static void CloseConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
