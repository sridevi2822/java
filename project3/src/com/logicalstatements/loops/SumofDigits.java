package com.logicalstatements.loops;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<n;n=n/10) {
			int r=n%10;
			sum=sum+r;	
			count++;
			
		}
		System.out.println("sum of digits: "+sum);
		System.out.println("count of digits: "+count);

	}

}
