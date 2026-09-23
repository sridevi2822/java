package com.logicalstatements.loops;

import java.util.Scanner;

public class Sumofeveposition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int n=sc.nextInt();
		System.out.println(sumofdigits(n));

		
	}
	static int sumofdigits(int rev) {
		int sum=0;
		int count=0;
		int r=0;
		//int rev=0;
		while(rev>0) {
			r=rev%10;
			rev=rev/10;
			//count=count+2;
			if(count%2==0) {
				sum=sum+r;
			}
			count++;
			}
				
		return sum;
		
	}
	
	static int reverse(int n) {
		int rev=0;
		int r=0;
		//r=n%10;
		while(n>0) {
			rev=rev*10+r;
		}
		return rev;
	
		
	}

}
