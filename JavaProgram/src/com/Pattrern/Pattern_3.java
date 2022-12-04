package com.Pattrern;
/** write an algoritham to display following pattern 

*********
********
*******
******
*****
****
***
**
*
r = 9
*/
public class Pattern_3 {

	public static void main(String[] args) {
	for(int r=1;r<=9;r++) {
		for(int c=9;c>=r;c--) {
			System.out.print("*");
		}
		System.out.println();
	}

	}

}
