package com.logicalstatements.loops;

import java.util.Scanner;

public class evecountno {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		int count=0;
		//int sum=0;
		for(;n>0;n=n/10) {
			int r=n%10;
			if(r%2==0) {
				count++;
			}
			
		}
		System.out.println("even number count: "+count);

		
//		if(n%2==0) {
//			count++;
//		}

	}

}
