package main.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	// This method is use to create and return data base connection
		public static Connection getConnection() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root", "root");
				return con;
			}catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		public static void closeConnection(Connection con) {
			try {
					con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

}
