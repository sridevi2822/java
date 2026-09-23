package com.logicalstatements.loops;

import java.util.Scanner;

public class Revereseno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		//String s="";
		System.out.println(reverse(n));

 
	}
	
	static String reverse(int n) {
		int r=0;
		String rev="";
		while(n>0) {	//n=123-->123>0(true)      
			r=n%10;		//r=123%10 = 3	     r=12%10=2		r=1%10=1
			n=n/10;		//123=123/10=12      12=12/10=1		1=1/10=0
			rev=rev+r;	//0=0*10+3=3	 3=3*10+2=32	32=32*10+1=321
		}
		return rev;
	}

}
