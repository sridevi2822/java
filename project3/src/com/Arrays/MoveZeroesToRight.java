package com.Arrays;

public class MoveZeroesToRight {

	public static void main(String[] args) {
		int[] arr= {1,0,9,3,2,0,4,0,0};
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
