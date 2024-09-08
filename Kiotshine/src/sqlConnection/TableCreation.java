package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/KIOTShine","root","2001");
			Statement statement = connection.createStatement();
			String query = "create table KIOTShine1"+ "(id int(5) not NULL, "+ "first varchar(255), "+ "last varchar(255), "+ "age int(5))";
			statement.executeUpdate(query);
			System.out.println("Table Created");
		}
		catch(Exception e) {
			System.out.println("exception");
	}
	}
}
