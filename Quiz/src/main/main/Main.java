package main.main;

import java.util.Scanner;

import main.bean.Student;
import main.util.ScUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println("***** Welcome To Quiz *****");
		playingQuiz();
		displayStudentScore();
	}
	
	public static void playingQuiz() {
		boolean flag = true;
		Scanner sc = ScUtil.getScanner();
		while(flag) {
			System.out.println("Enter Student ID : ");
			int id = sc.nextInt();
			System.out.println("Enter Student Name : ");
			String name = sc.nextLine();
			int score = 0;
			for(int i = 1; i <= 10; i++) {
				String ans = GetSetQuestion.getQuestionById(i);
				System.out.println("Enter your ans : ");
				String userAns = sc.nextLine();
				if(userAns.equalsIgnoreCase(ans)) {
					System.out.println(" Your Ans is Correct ");
					score = score+1;
				} else {
					System.out.println("Your ans is wrong Correct ans is "+ans);
				}
			}
			Student st = new Student(id, name, score);
			GetSetStudent.setStudent(st);
			System.out.println("Want to play more Enter y ");
			char in = sc.next().charAt(0);
			if(in=='y') {
				flag = true;
			}else {
				flag = false;
			}
		}
	}

	public static void displayStudentScore() {
		GetSetStudent.getAllStudens();
	}
}
