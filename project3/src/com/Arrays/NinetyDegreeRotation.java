package com.Arrays;

import java.util.Arrays;

public class NinetyDegreeRotation {

	public static void main(String[] args) {
		
//		ArrayLtoR(arr, r);
//		System.out.println(Arrays.toString(arr));

		int[][] arr=new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
//		int [][] arr1= {};
		
 	int a[][]=new int [3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				a[i][j]=arr[j][i];
				
			}

		}
		System.out.println(Arrays.deepToString(arr));

		System.out.println(Arrays.deepToString(a));

	}
//	static void ArrayLtoR(int[][] arr, int r) {
//		int start = 0;
//		int end = arr.length - 1;
//		reverseArray(arr, start, end);
//		reverseArray(arr, start, r);
//		reverseArray(arr, r + 1, end);
//
//	}
//
//	static void reverseArray(int[][] arr, int start, int end) {
//		int temp = 0;
//		while (start < end) {
//			temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//			start++;
//			end--;
//		}
//
//	}


}
