package com.Pattrern;
/* writen am algorithm to display following pattern

1
22
333
4444
55555
666666
7777777
88888888
999999999
*/
public class Pattern_1 {

	public static void main(String[] args) {
		for(int r=1;r<=9;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(r+"");
			}
			System.out.println();
		}

	}

}
