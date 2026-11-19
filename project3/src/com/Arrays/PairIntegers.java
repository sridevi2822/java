package com.Arrays;

public class PairIntegers {

	public static void main(String[] args) {
		int[] arr= {7,0,1,4,3,6,5};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int sum=arr[i]+arr[j];
				if(sum==7) {
					System.out.println(+arr[i] + " " +arr[j]);
				}
				
			}
		}
	}

}
