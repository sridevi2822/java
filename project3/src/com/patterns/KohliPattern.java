package com.patterns;

import java.util.Arrays;

public class KohliPattern {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int n=5;
		String s="kohli";
		char c='a';

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j || i+j==n-1) {
					System.out.print(" " +s.charAt(i) );
				}else {
					System.out.print(" " +c);
					c++;	
				}
			}
			System.out.println();
		}

	}

}
