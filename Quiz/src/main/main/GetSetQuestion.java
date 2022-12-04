package main.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import main.bean.Quetions;
import main.util.DbUtil;
import main.util.ScUtil;

public class GetSetQuestion {

	public static void main(String[] args) {
		
		Scanner sc = ScUtil.getScanner();

		Connection con = DbUtil.getConnection();
		int i = 1;
		while(i < 11) {
		for(; i <=10; i++) {
			System.out.println("Enter Quetion No "+i);
			String ques = sc.nextLine();
			System.out.println("Enter Option A");
			String a = sc.nextLine();
			System.out.println("Enter Option B");
			String b = sc.nextLine();
			System.out.println("Enter Option C");
			String c = sc.nextLine();
			System.out.println("Enter Option D");
			String d = sc.nextLine();
			System.out.println("Enter Answer");
			String ans = sc.nextLine();
		
			Quetions question = new Quetions(i, ques, a, b, c, d, ans);
		
			try {
				PreparedStatement stmt = con.prepareStatement("insert into quetions values(?,?,?,?,?,?,?)");
				stmt.setInt(1, question.getId());
				stmt.setString(2, question.getQuetion());
				stmt.setString(3, question.getOptionA());
				stmt.setString(4, question.getOptionB());
				stmt.setString(5, question.getOptionC());
				stmt.setString(6, question.getOptionD());
				stmt.setString(7, question.getAns());
				
				int out = stmt.executeUpdate();
				stmt.close();
				System.out.println(out +" rows affected");
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		}
		DbUtil.closeConnection(con);
		ScUtil.closeScanner(sc);
	}
	
	/*public static Quetions getQuestionById(int id) {
		Connection con = DbUtil.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("select * from questions where id=?");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Quetions q = new Quetions(rs.getInt("id"), rs.getString("question"), rs.getString("a"), rs.getString("b"), rs.getString("c"),
							rs.getString("d"), rs.getString("ans"));
				return q;
				
			}
			st.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		DbUtil.closeConnection(con);
		return null;
	}*/
	
	public static String getQuestionById(int id) {
		Connection con = DbUtil.getConnection();
		String ans = "";
		try {
			PreparedStatement st = con.prepareStatement("select * from questions where id=?");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println("Quetion No "+rs.getInt("id"));
				System.out.println("\t"+rs.getString("question"));
				System.out.println("\t"+rs.getString("a"));
				System.out.println("\t"+rs.getString("b"));
				System.out.println("\t"+rs.getString("c"));
				System.out.println("\t"+rs.getString("d"));
				ans = rs.getString("ans");
				
			}
			st.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ans;
		}
		DbUtil.closeConnection(con);
		return ans;
	}

}
