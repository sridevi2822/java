package com.logicalstatements.loops;

import java.util.Scanner;

public class NthFibanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt();
		fib(n);

	}

	static void fib(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		//int count = 0;
		if (n == 0) {
			System.out.println(n1);
		}else if(n==1) {
			System.out.println(n2);
		}
		 else {
			for (int i = 2; i <= n; i++) {
//				if (count == n) {
//					System.out.println(n3);
//					break;
//				}
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				//count++;
			}
			System.out.print("" + n3);

		}

	}

}
