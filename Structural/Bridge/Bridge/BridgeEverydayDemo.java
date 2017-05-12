package Bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {

	public static void main(String args[]) {

		try {
			//JDBC is an API
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver()); // <- Driver

			String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

			Connection conn = DriverManager.getConnection(dbUrl);

			Statement sta = conn.createStatement(); 
			
			//This client is an abstraction and can work with any database that has a driver
			sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20),"
							+ " City VARCHAR(20))");
			
			System.out.println("Table created");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
