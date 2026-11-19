package com.Arrays;

public class SubArrayMaxSum {

	public static void main(String[] args) {

		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSum = 0;
		int startIndex=0;
		int endIndex=0;

		for (int i = 0; i < arr.length - 1; i++) {

			int sum = arr[i];//-2

			for (int j = i + 1; j < arr.length; j++) {//1 2 3 4 5 6 7 8
				sum += arr[j];//-2+1=-1  -1+(-3)=-4   -4+4=0  0+(-1)=-1  -1+2=1   1+1=2  2+(-5)=-3  -3+4=1
				if (sum > maxSum) {  //2>1
					maxSum = sum; //1 2
					 startIndex = i;//0
					 endIndex = j;//5 6
				}
			}
		}
		System.out.println(maxSum);
		for(int i=startIndex;i<=endIndex;i++) {
			System.out.print(arr[i] +" ");
			System.out.println();
			System.out.print(i +" ");
			
		}

	}

}
