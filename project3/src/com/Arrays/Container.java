package com.Arrays;

public class Container {

	public static void main(String[] args) {
		int arr[]= {1,8,6,2,5,4,8,3,7};
		int left=0;
		int max=0;
		int right=arr.length-1;
		
		while(left<right) {
			int length=Math.min(arr[left], arr[right]);
			int width=right-left;
			int area=length*width;
			
			if(area>max) {
				max=area;
			}
			if(left<right) {
				left++;
			}else {
				right--;
			}
			
		}
		System.out.println(max);
		
		

	}

}
