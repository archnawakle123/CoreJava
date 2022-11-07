package main.main;

import java.util.Scanner;

import main.bean.Student;
import main.util.ScUtil;

public class Main {

	public static void main(String[] args) {
		Scanner sc = ScUtil.getScanner();
		System.out.println("***** Welcome To Quiz *****");
		boolean flag = true;
		while(flag) {
			System.out.println();
			System.out.println("Wants to play quiz enter Q");
			System.out.println("Wants to see yor score enter S");
			System.out.println("Wants to see score of all students enter A");
			System.out.println("Either enter any thing");
			char ch = sc.next().charAt(0);
			if(ch=='Q' || ch=='S' || ch=='A') {
			switch (ch) {
			case 'Q': playingQuiz();
				break;
			case 'S': displayStudentById();
				break;
			case 'A': displayStudentScore();
				break;

			default:
				break;
			}
			}else flag = false;
			
		}
	}
	
	public static void displayStudentById() {
		Scanner sc = ScUtil.getScanner();
		System.out.println("Enter Your Id : ");
		int id = sc.nextInt();
		GetSetStudent.getStudentById(id);
		
	}

	public static void playingQuiz() {
		boolean flag = true;
		Scanner sc = ScUtil.getScanner();
		while(flag) {
			System.out.println("Enter Student ID : ");
			int id = sc.nextInt();
			System.out.println("Enter Student Name : ");
			String name = sc.next();
			int score = 0;
			for(int i = 1; i <= 10; i++) {
				String ans = GetSetQuestion.getQuestionById(i);
				System.out.println("Enter your ans : ");
				String userAns = sc.next();
				if(userAns.trim().equalsIgnoreCase(ans)) {
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
