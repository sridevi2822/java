package com.Arrays;

public class KthLargestwithduplicates {

	public static void main(String[] args) {
		int max=Integer.MAX_VALUE;
		int k=3;
		int a[]= {4,5,9,6,2,6};
		
		for(int i=1;i<=k;i++) {
			int currentmax=Integer.MIN_VALUE;
			for(int j=0;j<a.length;j++) {
				if(currentmax<a[j] && a[j]<max) {
					currentmax=a[j];
				}
			}
			max=currentmax;
		}
		System.out.println("kth largest element: " +max);

	}

}
