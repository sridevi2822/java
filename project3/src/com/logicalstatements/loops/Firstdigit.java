package com.logicalstatements.loops;

import java.util.Scanner;

public class Firstdigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();
//        for(;n>=10;) {
//        	n=n/10;
//        }
//    	System.out.println(+n);
       int last=n%10;
        System.out.println(+last);

        
	}

}
