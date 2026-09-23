package com.logicalstatements.loops;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		duck(n);

	}
	static void duck(int n) {
		boolean isduck=false;
		while(n>0) {
			int r=0;
			r=n%10;
			if(r==0) {
				isduck=true;
			}
			n=n/10;
		}
		if(isduck) {
			System.out.println("duck number");
		}else {
			System.out.println("not a duck number");
		}
		
	}

}
