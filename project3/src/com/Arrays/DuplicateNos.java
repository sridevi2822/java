package com.Arrays;

public class DuplicateNos {

	public static void main(String[] args) {
		int[] arr= {1,4,1,2,6,8,4,8};
		
		for(int i=0;i<arr.length;i++) {
			boolean duplicate=false;
			
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					duplicate=true;
					break;
				}
			}
			if(duplicate) {
				System.out.println(arr[i]);
			}
		}

	}

}
