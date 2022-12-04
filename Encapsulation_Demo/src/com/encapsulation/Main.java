package com.encapsulation;

import java.util.Scanner;

public class Main {

	public static void getUserInput() {
		System.out.println("Enter the ID :");
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("Enter the Name :");
		String name = sc.next();
		System.out.println("Enter the City :");
		String city = sc.next();
		
		Employee emp=new Employee();
		emp.setId(id);
		emp.setEmpName(name);
		emp.setEmpCity(city);
		
		System.out.println("Employee Id :"+emp.getId());
		System.out.println("Employee Name :"+emp.getEmpName());
		System.out.println("Employee City :"+emp.getEmpCity());
			
		sc.close();
	}
		public static void main(String[] args) {
			getUserInput();
		}

}
