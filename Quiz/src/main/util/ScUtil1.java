package main.util;

import java.util.Scanner;

public class ScUtil1 {

	public static Scanner getScanner() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	public static void closeScanner(Scanner sc) {
		sc.close();
	}
}
