package com.multilevel_Inheritance;

public class Class_B extends Class_A {
	
	void multi(){
		a=15;
		b=5;
		c=a*b;
		System.out.println("Multiplication of two number is:"+c);
		
	}
	void div() {
		a=20;
		b=5;
		c=a/b;
		System.out.println("Division of two number is:"+c);
	}
}
