package com.array;

import java.util.Scanner;
//read 3 number from user and store them into array


public class Basics {

	public static void main(String[] args) {
		int[]arr=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 Numbers");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Number");
			 arr[i]=sc.nextInt();
		}
		//print all the value present in the array
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("values of array "+(i+1)+":"+arr[i]);
		}
		sc.close();

	}
	

}
