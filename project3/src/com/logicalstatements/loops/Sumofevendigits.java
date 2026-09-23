package com.logicalstatements.loops;

import java.util.Scanner;

public class Sumofevendigits {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number: ");
		int n =sc.nextInt();
		int sum=0;
		for(int i=0;i<n;n=n/10) {
			int r=n%10;
			if(r%2==0) {
				sum=sum+r;
			}
		}
		System.out.println("sum of eve digits: "+sum);


	}

}
