package com.logicalstatements.loops;

import java.util.Scanner;

public class SumofFib {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		sumfib(n);

	}
	static int sumfib(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		int sum=0;
		if(n==0) {
			System.out.println(n1);
		}else if(n==1) {
			System.out.println(n2);
		}else {
			for(int i=2;i<n+2;i++) {
			n3=n1+n2;
			System.out.println(n3);
			sum=sum+n3;
			n1=n2;
			n2=n3;
			}
			System.out.println("sum of fib numbers: " +sum );

		}
		return sum;
	}
	

}
