package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnectivity {
public static void main(String[] args) {
	try {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/KIOTShine","root","2001");
		Statement statement = connection.createStatement();
		
	String sql1 = "Create table KIOTShine1"+
						"(id integer not NULL, "+
						"first varchar(255), "+
						"last varchar(255), "+
						"age integer not null)";
						//"primary key(id))";             
		
		statement.executeUpdate(sql1);
		System.out.println("Table Created");
		}
//		String query1 = "insert into login values (001,'Veerammal','V','22')";
//		String query2 = "insert into login values (002,'Veera','V','22')";

	//	statement.executeUpdate("create database KIOTShine");
		
	//	{System.out.println("Database created successfully...");}
		//};
	catch(Exception exception)
	
	{
		System.out.println("Exception handled");
	}
}
}
