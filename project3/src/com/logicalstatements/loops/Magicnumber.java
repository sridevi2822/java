package com.logicalstatements.loops;

import java.util.Scanner;

public class Magicnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		n=magic(n);
		//System.out.println(magic(n));
		
		if(n==1) {
			System.out.println("its a magic number");
		}
		else {
			System.out.println("not a magic number");
		}
	}
	
	static int magic(int n) {
		while(n>9) {
			int sum=0;
			while(n>0) {
				int r=n%10;
				n=n/10;
				sum=sum+r;
			}
			n=sum;
		}
		return n;
		
	}

}
