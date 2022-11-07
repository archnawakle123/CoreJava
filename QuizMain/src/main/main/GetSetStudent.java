package main.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.bean.Student;
import main.util.DbUtil;

public class GetSetStudent {

	public static String setStudent(Student st) {
		Connection con = DbUtil.getConnection();
		int out = 0;
		try {
			PreparedStatement stmt = con.prepareStatement("insert into Student values(?,?,?)");
			stmt.setInt(1, st.getId());
			stmt.setString(2, st.getName());
			stmt.setInt(3, st.getScore());
			out = stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out+" Student set succuss!!!!!!!!!!!!!!!!!!!!!!";
	}
	
	public static void getStudentById(int id) {
		Connection con = DbUtil.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from Student where id=?");
			stmt.setInt(1, id);
			
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				System.out.print(result.getInt("id")+"\t");
				System.out.print(result.getString("name")+"\t");
				System.out.print(result.getInt("score"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void getAllStudens() {
		Connection con = DbUtil.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from Student order by score");
			
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				System.out.print(result.getInt("id")+"\t");
				System.out.print(result.getString("name")+"\t");
				System.out.print(result.getInt("score")+"\n");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
