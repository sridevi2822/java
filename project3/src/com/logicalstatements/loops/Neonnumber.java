package com.logicalstatements.loops;

import java.util.Scanner;

public class Neonnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		neon(n);
		
	}
	static int neon(int n) {			//Example: 9 → 9² = 81, 8 + 1 = 9 → Neon
		int n2=n*n;
		System.out.println(n2);
		int sum=0;
		int r=0;
		//int n2=0;
		for(int i=0;i<n2;n2=n2/10) {
			r=n2%10;
			sum=sum+r;
					
		}
		if(sum==n) {
			System.out.println("neon number");
		}else {
			System.out.println("not a neon number");
		}
		return sum;
	}

}
