package com.logicalstatements.loops;

import java.util.Scanner;

public class Perfectnumber {
	int sum=0;


	void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		if(isPerfect(n)) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("normal number");
		}
		
//		int count=0;
//		for(int i=1;i<=100;i++) {
//			if(isPerfect(i)) {
//				count++;
//				if(count==2) {
//					System.out.println(i);
//					break;
//				}
//			}
//		}

	}
	
	boolean isPerfect(int n) {
		int sum=0;
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				sum+=i;
			}
		}
		System.out.println(+count);
		return sum==n;
	}

}
