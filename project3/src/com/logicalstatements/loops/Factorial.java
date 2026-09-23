package com.logicalstatements.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		fact(n);
		System.out.println(fact(n));

	}
	
	static int fact(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}
