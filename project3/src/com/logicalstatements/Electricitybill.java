package com.logicalstatements;

import java.util.Scanner;

public class Electricitybill {
//	String type;
//	int rate;
//	int charge;
//	int units;

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter connection type: ");
		int rate = 0;
		int charge = 0;
		int units = 0;
		String type = sc.next();

		switch (type) {
		case "domestic" -> {
			System.out.println("domestic type connection");
			// String type=sc.next();

			System.out.println("enter units");
			units = sc.nextInt();
			if (units <= 100) {
				charge = 2;
				System.out.println(" charge 2 per unit");
				rate = charge * units;

			} else if (units >= 300) {
				charge = 3;
				System.out.println("charge 3 per units");
				rate = charge * units;
			} else {
				System.out.println("invalid units");
			}

		}
		case "commercial" -> {
			System.out.println("commercial type connection");
			System.out.println("enter units");
		    units = sc.nextInt();
			if (units <= 100) {
				charge = 4;
				System.out.println(" charge 4 per unit");
				rate = charge * units;

			} else if (units >= 100 && units <= 300) {
				charge = 6;
				System.out.println("charge 6 per unit");
				rate = charge * units;

			} else if (units > 300) {
				charge = 8;
				System.out.println("charge 8 per unit");
				rate = charge * units;

			}

		}
		default -> System.out.println("invalid connection type");

		}
		System.out.println("connection type: " + type);
		System.out.println("units consumed: " + units);
		System.out.println("rate per unit: " + charge);
		System.out.println("total electricity bill: " + rate);

	}

}
