package sqlConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class MyDatabase {
	public static void main(String[] args) {
		try {
			// Class.forName("com.sql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306","root","2001");
			Statement statement = connection.createStatement();
			statement.executeUpdate("create database StudentDetails");
			System.out.println("Database created successfully");
		}
		catch(Exception exception) {
			System.out.println("Exception handled");
		}
	}
}
