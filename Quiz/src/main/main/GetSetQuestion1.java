package main.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import main.bean.Quetions1;
import main.util.DbUtil;
import main.util.ScUtil1;

public class GetSetQuestion1 {

	public static void main(String[] args) {
		
		Scanner sc = ScUtil1.getScanner();

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
		
			Quetions1 question = new Quetions1(i, ques, a, b, c, d, ans);
		
			try {
				PreparedStatement stmt = con.prepareStatement("insert into quiz values(?,?,?,?,?,?,?)");
				stmt.setInt(1, question.getId());
				stmt.setString(2, question.getQuetions());
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
		ScUtil1.closeScanner(sc);
	}
		
	public static String getQuestionById(int id) {
		Connection con = DbUtil.getConnection();
		String ans = "";
		try {
			PreparedStatement st = con.prepareStatement("select * from quiz where id=?");
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.println("Quetion No "+rs.getInt("id"));
				System.out.println("\t"+rs.getString("quetion"));
				System.out.println("\t"+rs.getString("A"));
				System.out.println("\t"+rs.getString("B"));
				System.out.println("\t"+rs.getString("C"));
				System.out.println("\t"+rs.getString("D"));
				ans = rs.getString("Answer");
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
