package com.Arrays;

public class SumOfNextnPrevious {

	public static void main(String[] args) {
		int[] arr = {1,2,4,6,0,6,3,5,8};
		int[] temp=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				temp[i]=arr[i+1];
			}else if(i==arr.length-1) {
				temp[i]=arr[i-1];
			}else {
				temp[i]=arr[i+1]+arr[i-1];
			}
			
			System.out.println(temp[i]);
			
		}

	}

}
