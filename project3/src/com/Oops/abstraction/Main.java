package com.Oops.abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upi id:");
		String upiid=sc.nextLine();
		Payment p=new UPIPayment();
		p.displaymessage();
		p.makePayment();
		
		 p=new CreditCardPayment();
		 p.makePayment();
		 
		 p=new NetBankingPayment();
		 p.makePayment();
		 
		 sc.close();
		
	}

}
