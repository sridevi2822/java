package com.logicalstatements.loops;

import java.util.Scanner;

public class Harshadno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println(harshad(n));
		
	}
	static int harshad(int n) {
		int n1=n;
		int r=0;
		int sum=0;
		for(int i=0;i<n;n=n/10) {
			r=n%10;
			//n=n/10;
			sum=sum+r;	//3
		}
		if(n1%sum==0) {
			System.out.println("harshad number");
		}else {
			System.out.println("not a harsad numer");
		}
		return sum;
	}

}
