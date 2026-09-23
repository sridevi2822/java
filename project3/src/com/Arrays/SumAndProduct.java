package com.Arrays;

public class SumAndProduct {

	public static void main(String[] args) {
		int[] arr= {20,39,40,5};
		int sum=0;
		int product=1;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
			product=product*arr[i];
		}
		System.out.println("sum: " +sum);
		System.out.println("product: " +product);
	}

}
