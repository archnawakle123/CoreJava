package com.list;

import java.util.ArrayList;

//return array list to method
public class ReturnArrayListToMethod {
	public void getAdd() {
	ArrayList<String> al=new ArrayList<>();
	al.add("asd");
	al.add("fgh");
	al.add("qwe");
	System.out.println(al);
	}
	public static void main(String[] args) {
		ReturnArrayListToMethod s=new ReturnArrayListToMethod();
		s.getAdd();
	}
}


