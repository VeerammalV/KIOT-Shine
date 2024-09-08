package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentTable {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentdetails","root","2001");
			Statement statement =connection.createStatement();
			String query1 = "create table students" + "(id int(2) not null, " + "fisrtname varchar(255)," +  "lastname varchar(255))";
			System.out.println("Table created");
		}
		catch(Exception e) {
			System.out.println("exception handled");
		}
	}

}
