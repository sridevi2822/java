package com.Oops.loanapp;

public class Homeloan extends loanImpl {

	public static void main(String[] args) {
		Homeloan hl = new Homeloan();
		int cibil=hl.getCibilScore();

		if (hl.getempsal() >= 100000 && cibil >= 300 && cibil <= 900) {
			System.out.println("lets check more detailss");

			if (hl.isAdhaarValid() && hl.isPanValid() && hl.isPhoneValid()) {
				System.out.println("congratutaltions!!Your home loan approved");
				System.out.println("your interest rate is: " + hl.getROI());

			} else {
				System.out.println("check your personal details once..");
			}
		} else {
			System.out.println("not eligible for loan");
		}

	}

}
