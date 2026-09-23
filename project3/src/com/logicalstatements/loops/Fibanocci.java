package com.logicalstatements.loops;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many times you want the number");
		int n =sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1 + " " + n2);
		for(int i=1;i<=n-2;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
