package com.logicalstatements.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n =sc.nextInt();
		reverse(n);
		//System.out.println(reverse(n));
	}
	static void reverse(int n) {
		int n1=n;
		int r=0;
		int rev=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			
		}
		if(n1==rev) {
			System.out.println("its a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		//return n;
		
	}

}
