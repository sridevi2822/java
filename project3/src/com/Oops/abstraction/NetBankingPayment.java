package com.Oops.abstraction;

import java.util.Scanner;

public class NetBankingPayment implements Payment{
	
	String password="sri123";
	
	@Override
	public void makePayment() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
		String ps=sc.next();
		
		if(password.equals(ps)) {
			System.out.println("password matched");
			System.out.println("payment successful!!");
		}else {
			System.out.println("check once again...");
		}
		
	}

}
