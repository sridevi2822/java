package com.logicalstatements.loops;

import java.util.Scanner;

public class nPrime {
	
	static boolean isprime(int n) {
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
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int count=0;
		int n1=2;
		for(;count<n;n1++) { //0 ->2
			if(isprime(n1)) {
				System.out.println(n1);
				count=count+1;
			}
		}
		
		

	}

}
