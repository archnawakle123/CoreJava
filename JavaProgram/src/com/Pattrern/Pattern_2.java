package com.Pattrern;
/* Write an algorithm to display following pattern

111111111
22222222
3333333
444444
55555
6666
777
88
9
*/
public class Pattern_2 {

	public static void main(String[] args) {
		for(int r=1;r<=9;r++) {
			for(int c=9;c>=r;c--) {
				System.out.print(r);
			}
			System.out.println();
		}

	}

}
