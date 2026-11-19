package com.Oops.loanapp;

import java.util.Scanner;

public class loanImpl implements Loan{
	
	static Scanner sc= new Scanner(System.in);
	
	 void hello() {
		System.out.println("hello method called from loan");
	}
	
	@Override
	public double getempsal() {
		System.out.println("enter your salary");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getCibilScore() {
		System.out.println("enter your cibil score");
		int cibilscore = sc.nextInt();
		return cibilscore;
	}

	@Override
	public double getROI() {
		double roi = 14.0;
		int cibil = getCibilScore();
		if (cibil > 800 && cibil < 900) {
			System.out.println("excellent:strong credit profile");
			roi = roi - 5;
		} else if (cibil > 760 && cibil <= 800) {
			System.out.println("very good: higher chances of approval");
			roi = roi - 4;
		} else if (cibil > 700 && cibil <= 760) {
			System.out.println("good:eligible for loans with decent terms");
			roi -= 3;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("average: may get loans but at higher interests");
			roi -= 1;
		} else if (cibil > 300 && cibil <= 600) {
			System.out.println("Poor:high risk ,loan may get rejected");
		} else {
			System.out.println("invalid!!!");
		}
		return roi;

	}
	
	
	@Override
	public boolean isAdhaarValid() {
		System.out.println("enter aadhaar number");
		String aadhar = sc.next();
		boolean aadharstatus = aadhar.matches("[2-9]{1}[0-9]{11}");
		return aadharstatus;
	}

	@Override
	public boolean isPanValid() {
		System.out.println("enter pan number");
		String pan = sc.next();
		boolean panstatus = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return panstatus;
	}

	@Override
	public boolean isPhoneValid() {
		System.out.println("enter phone number");
		String phone = sc.next();
		boolean phonestatus = phone.matches("[6-9]{1}[0-9]{9}");
		return phonestatus;
	}

}
