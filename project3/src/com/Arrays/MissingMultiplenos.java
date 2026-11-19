package com.Arrays;

public class MissingMultiplenos {

	public static void main(String[] args) {
		int[] arr= {1,4,5,9,11};
		for(int i=0;i<arr.length-1;i++) {
			int start=arr[i];
			int end=arr[i+1];
			for(int j=start+1;j<end;j++) {
				System.out.println(j);
			}
		}

	}

}
