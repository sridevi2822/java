package com.logicalstatements;

import java.util.Scanner;

public class Onlinevoting {

	static void display() {
		System.out.println("First candidtate" + "userid=1");
		System.out.println("second candidate" + "userid=2");
		System.out.println("second candidate" + "userid=3");
		System.out.println("second candidate" + "userid=4");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();
		System.out.println("enter gender");
		char gender = sc.next().charAt(0);

		if (age < 18) {
			System.out.println("not eligible for voting!!");
		} else {
			System.out.println("eligible for voting!!");
			if (gender == 'M' || gender == 'F') {
				System.out.println("enter voterid no");
				int voterid=sc.nextInt();
				display();
				System.out.println("enter user");
				int user=sc.nextInt();
				switch(user) {
				case 1 -> System.out.println("voted for sri");
				case 2 -> System.out.println("voted for hema");
				case 3 -> System.out.println("voted for pravs");
				case 4 -> System.out.println("voted for xyz");
				default->System.out.println("invalid user");
				}
			} else {
				System.out.println("not eligible fot voting!!");
			}
		}
	}

}
