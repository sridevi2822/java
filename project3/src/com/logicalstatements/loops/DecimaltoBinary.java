package com.logicalstatements.loops;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		convertDecimaltoBinary(n);

	}
	static void convertDecimaltoBinary(int n) {
		String s="";
		while(n>0) {//n=18  
			int r=n%2;//r=0	r=9%2=1	r=4%2=0  r=2%2=0 r=1%2=1
			n=n/2; //n=18/2=9	n=9/2=4  n=4/2=2  n=2/2=1  n=1/2=0
			s=r+s;//01
		}
		
		System.out.println("binary number is: "+s);
	}

	//r=101
}

