package com.logicalstatements.loops;

import java.util.Scanner;

public class Happyno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		happy(n);
		
	}
	static int happy(int n) {
		int sum=0;
		int r=0;
		while(n!=1 && n !=4) {
			sum=0;
			while(n>0){
				r=n%10;
				n=n/10;
				int sqrr=r*r;
				sum=sum+sqrr;
			}
			n=sum;
		}
		if(n==1) {
			System.out.println("happy number");
		}else {
			System.out.println("not a happy number");
		}
		return n;
	}

}
