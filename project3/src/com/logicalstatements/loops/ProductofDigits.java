package com.logicalstatements.loops;

import java.util.Scanner;

public class ProductofDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number: ");
		int n =sc.nextInt();
		int product=1;
		for(int i=0;i<n;n=n/10) {
			int r=n%10;
			product=product*r;
		}
		System.out.println(product);


	}

}
