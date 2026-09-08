package com.logicalstatements;
import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value: ");
		int n = sc.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("Fizzz Buzzz");
		}
		else if(n%3==0) {
			System.out.println("Fizzz");
		}
		else if(n%5==0) {
			System.out.println("Buzz");
		}

	}

}
