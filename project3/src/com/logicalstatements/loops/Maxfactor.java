package com.logicalstatements.loops;

import java.util.Scanner;

public class Maxfactor {

	public static void main(String[] args) {
		int max=0;
		// int n=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				max = i;
			}

		}
		System.out.println("max factor: " +max);

	}

}
