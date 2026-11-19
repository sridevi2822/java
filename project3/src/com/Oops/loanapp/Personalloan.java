package com.Oops.loanapp;

import java.util.Scanner;

public class Personalloan extends loanImpl {

	static Scanner sc = new Scanner(System.in);
	
	@Override
	public double getROI() {
		double roi = 16.0;
		int cibil = getCibilScore();
		if (cibil > 800 && cibil < 900) {
			System.out.println("excellent:strong credit profile");
			roi = roi - 6;
		} else if (cibil > 760 && cibil <= 800) {
			System.out.println("very good: higher chances of approval");
			roi = roi - 5;
		} else if (cibil > 700 && cibil <= 760) {
			System.out.println("good:eligible for loans with decent terms");
			roi -= 4;
		} else if (cibil > 600 && cibil <= 700) {
			System.out.println("average: may get loans but at higher interests");
			roi -= 3;
		} else if (cibil > 300 && cibil <= 600) {
			System.out.println("Poor:high risk ,loan may get rejected");
		} else {
			System.out.println("invalid!!!");
		}
		return roi;

	}
	
	@Override
	 void hello() {
		System.out.println("hello method called from personal loan");
	}
	
	void getpersonaloanDocuments() {
		System.out.println("All documents have been received succesfully..");
	}

	public static void main(String[] args) {
		System.out.println("welcome to personal banking!!");
		Personalloan pl=new Personalloan();
		double salary=pl.getempsal();
		
	      pl.hello();
		
		int cibilscore=pl.getCibilScore();
		if(salary>=100000 && (cibilscore>=300 && cibilscore<=900)) {
			System.out.println("lets check more detailss");
			
			if(pl.isAdhaarValid() && pl.isPanValid() && pl.isPhoneValid()) {
				System.out.println("congratutaltions!!Your personal loan approved");
				System.out.println("your interest rate is: " +pl.getROI());
				pl.getpersonaloanDocuments();
				
			}else {
				System.out.println("check your personal details once..");
			}
		}else {
			System.out.println("not eligible for loan");
		}

	}

	

}
