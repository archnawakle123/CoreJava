package com.array;

public class Array3 {
	//wap to create an array of 10 int number and print only even
	//number on consol
	public static void main(String[] args) {
			int num[]= {1,2,3,4,5,6,7,8,9,10};
			for(int i=0;i<10;i++) {
				if(num[i]%2==0) {
					System.out.println(num[i]);
				}
			}

	}

}
