package com.list;

import java.util.ArrayList;

public class Lambda_Example {

	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add("50");
		al.add(99);
		al.add('A');
		al.add(98);
		
		al.forEach(al->System.out.println(al));
	}

}
