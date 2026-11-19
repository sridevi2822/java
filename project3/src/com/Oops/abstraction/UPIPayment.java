package com.Oops.abstraction;

import java.util.Scanner;

public class UPIPayment implements Payment{
	
	String upiid="sbi654";
	
	@Override
	public void makePayment() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter upi ID");
		String upiID=sc.next();
		
		if(upiid.equals(upiID)) {
			System.out.println("upi id matched");
		}else {
			System.out.println("check once again...");
		}

		
	}
	

}
