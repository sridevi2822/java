package com.logicalstatements;

import java.util.Scanner;

public class Week {

	public static void main(String[] args) {
		
		String yn="";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the week day: ");
			String week=sc.next().toUpperCase();
			
			switch(week) {
			case "MON"-> System.out.println("Mon is a boring day!!");
			case "TUE" -> System.out.println("tues is for hanuman!!");
			case "WED"-> System.out.println("we is non-veg day");
			case "Thur"->System.out.println("thurs is market day");
			case "FRI","SAT" -> System.out.println("weekend mode started");
			case "SUN"-> System.out.println("Relax mode");
			default->System.out.println("something went wrong!!!");
			}
			System.out.println("Do you want to continue..?Click Y for yes and N for no.");
			yn=sc.next();

		}while(yn.equalsIgnoreCase("y"));
	}

}
