package com.test;

public class BookingFactory {
//desing the factory method here
	//input shoud be 1 2 3
	public static Booking createBooking(String input) {
		if(input.equalsIgnoreCase("First")) {
			return new FirstTier();
		}else if(input.equalsIgnoreCase("Second")) {
			return new SecondTier();
		}else if(input.equalsIgnoreCase("third")) {
			return new ThirdTier();
		}
		throw new IllegalArgumentException("Invalid input from user..");
		
	}

}
