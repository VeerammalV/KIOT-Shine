package sqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kiotshine","root","2001");
			Statement statement = connection.createStatement();
	//		String query1 = "create table User"+"(id int(2) not null, "+ " name varchar(255), " + "lastname varchar(255))";
			String query2 = "select * from User";
			//String Query3 = "insert into User values('01','veera','v'), ('02','swarna','B'),('03','mohan','e')";
			//statement.executeUpdate(query2);
			System.out.println("Table create");
			ResultSet resultset = statement.executeQuery(query2);
			while(resultset.next()) {
				System.out.print("\nThe id is: "+resultset.getInt("id"));
				System.out.print(" The name is: "+resultset.getString("name"));
				System.out.println(" The id is: "+resultset.getString("lastname"));
			}
			
					
		}
		catch(Exception e) {
			System.out.println("exception handeled");
		}

	}

}
