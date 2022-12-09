package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda_Example {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(20);
		list.add(40);
		list.add(10);
		list.add(80);
		list.add(60);
		list.add(100);
		list.add(30);
		
		Collections.sort(list);//asending order
		System.out.println(list);
		
		Collections.reverse(list);//desending order
		System.out.println(list);
	}

}
