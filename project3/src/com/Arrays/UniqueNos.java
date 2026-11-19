package com.Arrays;

public class UniqueNos {

	public static void main(String[] args) {
		int[] arr= {1,6,6,2,9,6,7,7,9,7,8};
	//	boolean[] b = 
		//int count=0; 
		
		for(int i=0;i<arr.length;i++) {
		int count=0; 
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println(arr[i]);
			}

		}

	}

}
