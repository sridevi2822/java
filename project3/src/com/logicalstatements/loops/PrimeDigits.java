package com.logicalstatements.loops;

import java.util.Scanner;

public class PrimeDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int r=0;
		int x=n;
		int y=n;
		int d=10;
		
		while(y!=0) {
			while(n>0) {
				r=n%d;//12345=5
				if(isPrime(r)) {
					System.out.println(r);
				}	
				n=n/10;

			}
			d=d*10;
			n=x;
			y=y/10;

		}
		
	}
	static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
