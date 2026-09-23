package com.logicalstatements.loops;

import java.util.Scanner;

public class Strongno {
	
	static int checkfact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int sum=0;
		int n=sc.nextInt();
		int temp=n;
		for(int i=0 ;i<temp; temp=temp/10) {
			int r=temp%10;
			sum=sum+checkfact(r);
		}
		if(sum==n) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not strong");
		}
	}

}
