package com.list;

import java.util.LinkedList;

public class Demo {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(10);
		l.add(9);
		l.add(8);
		l.add(7);
		l.add(6);
		l.add(5);
		
		//int a=l.get(3);
		//System.out.println("4th index is "+a);
		
		for(Integer i:l) {
			System.out.println(l);
		}
	}

}
