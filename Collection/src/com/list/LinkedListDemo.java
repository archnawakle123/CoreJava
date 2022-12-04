package com.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList al=new LinkedList<>();
		al.add(99);
		al.add(99);
		al.add("kk");
		al.add(null);
		al.add('t');
		al.add(null);
		al.add("Aaa");
		System.out.println(al);
		al.addFirst(al);

	}

}
