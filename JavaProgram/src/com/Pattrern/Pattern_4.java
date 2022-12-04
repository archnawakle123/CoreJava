package com.Pattrern;

public class Pattern_4 {

	public static void main(String[] args) {
		for(int r=1;r<=10;r++) {
			for(int c=10;c>=r;c--) {
				System.out.print("@");
			}
			System.out.println();
		}

	}

}
