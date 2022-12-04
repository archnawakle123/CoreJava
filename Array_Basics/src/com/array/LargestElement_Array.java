package com.array;

public class LargestElement_Array {

	public static void main(String[] args) {
		int []arr= {25,11,7,99,89};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
					max=arr[i];
			}
		}
			System.out.println("Largest Element Present in given arrt :"+max);
		}

	}


