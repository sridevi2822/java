package com.Arrays;

import java.util.Scanner;

public class KthLargest {	

	public static void main(String[] args) {
		int arr[]= {4,5,5,7,1,3};
		int largest=0;
		int count=0;
//		int k=2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter k value: ");
		int k=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			 count=0;
			for(int j=0;j<arr.length;j++) {// 0 1 2
				if(arr[i]<arr[j]) {// 4<5 
					count++;//1 
				}
			}
			if(count==k-1) {
				largest=arr[i];
				break;
			}			
		}
		System.out.println("kth largest element is: "+largest);

	}

}
