package DemoPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 	
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/database");
		
		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("SELECT * from tbl_login");
		
		while(result.next()) {
			System.out.println("ID is--> " + result.getString(1) + "-->Name is --> "+ result.getString(2) + "-->password is -->" + result.getString(3));
		}
		
	}

}
