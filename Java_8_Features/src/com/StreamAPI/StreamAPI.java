package com.StreamAPI;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI {

	public static void main(String[] args) {
		
		//print Numbers
		IntStream.of(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);
		System.out.println("*******************");
		
		//print Square
		List<Integer> numberlist=Arrays.asList(2,4,6,8,10,4,1,9,11,34,43,12);
		List<Integer>squarelist=numberlist.stream().map(n->n*n).distinct().collect(Collectors.toList());
		squarelist.forEach(System.out::println);
		
		//Remove Empty Space
		List<String>namelist=new ArrayList<>();
		namelist.add("Archna");
		namelist.add("Hindavi");
		namelist.add("Khushi");
		namelist.add("");
		namelist.add("Pranu");
		namelist.add("");
		namelist.add("Rudra");
		namelist.add("");
		long count=namelist.stream().filter(name->name.isEmpty()).count();
		System.out.println("Number of empty String:"+count);
		
		//print table
		System.out.println("####################################");
		IntStream.iterate(4, n->n+4).limit(10).forEach(System.out::println);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//sort in assending order
		numberlist.stream().sorted().forEach(System.out::println);
		
		
		//Evennumber
			List<Integer>newlist=numberlist.stream().filter(i->i%2==0).collect(Collectors.toList());
		    System.out.println(newlist); 
		
		   //greater than 10       				
		  List<Integer>newlist1=numberlist.stream().filter(i->i>10).collect(Collectors.toList());
		  System.out.println(newlist1);
		  
		  List<Integer> list=numberlist.stream().sorted().collect(Collectors.toList());
		  System.out.println(list);
		  
		  
	}

}
