package com.logicalstatements;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to matrimonial site!!");
		System.out.println("can you please enter your name");
		String name=sc.nextLine();
		System.out.println("Hello mr "+ name + " Nice to meet you");
		System.out.println("can you please enter your assets");
		double assets=sc.nextDouble();
		System.out.println("enter your salary: ");
		double salary=sc.nextDouble();
		if((assets>=2500000 && assets>=6000000) && (salary>=120000 && salary<=300000)){
			System.out.println("Oh!! Lets continue the discussion");
			System.out.println("enter your age: ");
			int age=sc.nextInt();
			if(age>=26 && age<=29) {
				System.out.println("We will continue the discussion!!");
				
				System.out.println("Enter your height:");
				float height=sc.nextFloat();
				System.out.println("eneter your weight:");
				float weight=sc.nextFloat();
				
				if((height>=5.6 && height<=6.3) && (weight>=65 && weight<=75)){
					System.out.println("Cool!! Will move on to discussion");
					
					System.out.println("do you have any siblings??");
					boolean sibstatus=sc.nextBoolean();
					if(!sibstatus) {
						System.out.println("Okay! we will get back you soon");
					}
					else {
						System.out.println("OMG!!Sorry to continue..");
					}
				}
				else {
					System.out.println("Your height and weight are not matching!!");
				}
			}
			else {
				System.out.println("Your age is not matching with our profile..");
			}
		}
		else {
			System.out.println("You can leave for the day!!");
		}

	}

}
