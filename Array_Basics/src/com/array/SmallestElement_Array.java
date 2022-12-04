package com.array;

public class SmallestElement_Array {

	public static void main(String[] args) {
		int min=0;
		int arr[]=new int[] {30,87,77,34,20};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j])
					min=arr[i];
					
			}
			
		}
		System.out.println("Min :"+min);

	}

}
