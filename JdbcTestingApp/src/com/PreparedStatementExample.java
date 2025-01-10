package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "Farrux2006");
			System.out.println("Connected successfully");
			Statement stmt = con.createStatement();

			// insert Query

			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?, ?, ?)");
			System.out.println("Enter the id ");
			int id = sc.nextInt();
			pstmt.setInt(1, id);

			System.out.println("Enter teh name ");
			String name = sc.next();
			pstmt.setString(2, name);

			System.out.println("Enter the salary ");
			float salary = sc.nextFloat();
			pstmt.setFloat(3, salary);

			int result = pstmt.executeUpdate();
			if (result > 0) {
				System.out.println("Record inserted successfully!");
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
