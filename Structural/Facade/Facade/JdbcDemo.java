package Facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main (String args []) {
		DbSingleton instance = DbSingleton.getInstance();
		
		try {
			Connection conn = instance.getConnection();
			
			Statement sta = conn.createStatement();
			int count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName "
					+ "VARCHAR(20), City VARCHAR(20))");
			
			System.out.println("Table created.");
			sta.close();
			
			sta = conn.createStatement();
			count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) "
					+ "values (1, '1234 Some street', 'Layton')");
			System.out.println(count + " record(s) created.");
			sta.close();
			
			sta = conn.createStatement();
			ResultSet rs = sta.executeQuery("SELECT * FROM Address");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
