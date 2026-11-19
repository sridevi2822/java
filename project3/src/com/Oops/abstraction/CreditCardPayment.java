package com.Oops.abstraction;

import java.util.Scanner;

public class CreditCardPayment implements Payment{
	
	int cvv=701;
	
	@Override
	public void makePayment() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your cvv");
		int CVV=sc.nextInt();
		
		if(cvv==CVV) {
			System.out.println("CVV Matched..");
		}else {
			System.out.println("something went wrong!!");
			
		}
		
	}
	

}
