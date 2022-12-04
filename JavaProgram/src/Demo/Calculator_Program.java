package Demo;

import java.util.Scanner;

public class Calculator_Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a =sc.nextInt();
		System.out.println("Enter Second Number");
		int b =sc.nextInt();
		System.out.println("Select Symbol For add(+),Sub(-),Mul(*),Div(/)");
		String symbol=sc.next();
		int result;
		switch(symbol)
		{
		case "+":result=a+b;
			System.out.println("Addition is :"+result);
			break;
			
		case "-":result=a-b;
		System.out.println("Subtraction is :"+result);
			break;
			
		case "*":result=a*b;
		System.out.println("Multiplication is :"+result);
			break;
			
		case "/":result=a/b;
		System.out.println("Division is :"+result);
			break;
		default:
		System.out.println("Invalid Statement");
		
		sc.close();
		}
		
	}
	

}
