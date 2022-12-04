package com.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String booking;
		System.out.println("Enter the AC Class Type>>");
		
		Scanner sc=new Scanner(System.in);
		booking=sc.next();
		Booking b=BookingFactory.createBooking(booking);
		System.out.println(b.getZClass());
		sc.close();
	}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
