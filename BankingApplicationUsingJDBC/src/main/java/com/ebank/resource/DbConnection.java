package com.ebank.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	static Connection con;
	// this code executes only once when the class gets loaded...
	static {
		// System.out.println("Static block gets called to get db connection");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Farrux2006");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static Connection getDbConnection() {

		try {
			return con;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
}