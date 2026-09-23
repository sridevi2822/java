package com.logicalstatements.loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		int count=0;
		int sum=0;

		while(n>0) {
			int r=n%10;
			n=n/10;
			sum=sum+r*(int)(Math.pow(2,count));
			count++;
		}
		System.out.println(sum);

	}

}
