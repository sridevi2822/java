package com.logicalstatements.loops;

import java.util.Scanner;

public class Spyno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		spy(n);

	}
	static int spy(int n) {
		int r=0;
		int prod=1;
		int sum=0;
		while(n>0) {	//n=1124
			r=n%10;		//r=1124%10=4		r=112%10=2		r=11%10=1   r=1%10=1
			n=n/10;		//1124=1124/10=112	112/10=11		n=11/10=1	n=1/10=0
			sum=sum+r;	//0=0+4=4			sum=4+2=6		sum=6+1=7	sum=7+1=8
			prod = prod*r;//prod=1*4=4		p=4*2=8			p=8*1=8		p=8*1=8
		}
		if(sum==prod) {
			System.out.println("its a spy number");
		}else {
			System.out.println("its not a spy number");
		}
		return prod;
	}

}
