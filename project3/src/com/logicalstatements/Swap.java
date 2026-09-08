package com.logicalstatements;

public class Swap {
	
	public static void main(String[] args) {
		//using arithmatic operators
		int a =10;
		int b=20;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("a= "+a);
//		System.out.println("b= "+b);
		
		//using temperary variable
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("a= "+a);
//		System.out.println("b= "+b);
		
		//using bitwise operators
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		

		
		

	}

}
