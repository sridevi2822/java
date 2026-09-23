package com.logicalstatements.loops;

import java.util.Scanner;

public class Prime {
	static boolean factcount(int n) {
		int factcount=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factcount++;
			}
		}
		
		if(factcount==2) {
			return true;
		}
		return  false; 
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n =sc.nextInt();
		factcount(n);
		if(factcount(n)) {
			System.out.println("is prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}
