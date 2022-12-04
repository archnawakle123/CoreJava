package com.demo;
public class OverlaodingDemo1 {
	public static void main(String[] args) {
		Calculate cal = new Calculate();
		cal.add(10,20);
		cal.add(11.2, 29);
		cal.add(22.8, 22);
		cal.add(11, 22.2);
		cal.add("abc", "xyz");
		cal.add(20, 28, 02);
		
	}
}

class Calculate {
	int a=10,b=30;
	public void add(int a, int b) {
		int ans = a + b;
		System.out.println("2 int Addition is : " + ans);
	}
	
	public void add(int a, int b, int c) {
		int ans = a + b + c;
		System.out.println("3 int Addition is : " + ans);
	}
	
	public void add(double a, double b) {
		double ans = a + b;
		System.out.println("2 double Addition is : " + ans);
	}
	
	public void add(String s1, String s2) {
		String ans = s1 + s2;
		System.out.println("2 String Addition is : " + ans);
	}
	
	
	public void add(int a, float b) {
		double ans = a + b;
		System.out.println("1 int and 1 float Addition is : " + ans);
	}
	
	protected double add(float a, int b) {
		double ans = a + b;
		System.out.println("1 float and 1 int Addition is : " + ans);
		return ans;
	}
}



