package com.logicalstatements.loops;

import java.util.Scanner;

public class AutomorphicNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt();
		automorphic(n);
	}
	static int automorphic(int n) {
		int count=0;
		int prod=n*n;
		int n1=n;
		while(n1>0) { //n=25       n=2
			count++;	//count=1	count=2
			n1=n1/10;
		}
		double power=prod%Math.pow(10,count);
		if(power==n) {
			System.out.println("automorphic number");
		}else {
			System.out.println("not automorphic number");
		}

		return n;
	}

}
