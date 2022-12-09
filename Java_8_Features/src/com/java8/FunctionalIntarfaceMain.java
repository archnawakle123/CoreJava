package com.java8;

public class FunctionalIntarfaceMain {

	public static void main(String[] args) {
		Demo demo=(a,b)->(a*b);
		System.out.println(demo.getMultiplication(12, 12));
		
		Demo demo1=(x,y)->(x*y);
		System.out.println(demo1.getMultiplication(5, 5));
	}

}
