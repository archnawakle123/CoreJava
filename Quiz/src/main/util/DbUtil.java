package main.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	
		
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("mysql:jdbc://localhost:3306/quiz","root","root");
			return con;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	public static void closeConnection(Connection con) {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	}


