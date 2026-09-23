package com.logicalstatements.loops;

public class Numbers {
	static int nums(int n) {
		if(n==100) {
			System.out.println(n);
			return n;
		}
		System.out.println(n);
		return nums(n+1);
	}

	public static void main(String[] args) {
		nums(1);
		
	}

}
