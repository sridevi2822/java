package com.Oops.abstraction;

public interface Payment {
	
	void makePayment();
	 
	default void displaymessage() {
		System.out.println("WELCOME TO PAYMENT SYSTEM!!");
	}
	

}
