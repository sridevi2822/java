package com.patterns;

public class PositionPrime {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int k = 0;
		int[] arr1 = { 2, 3, 5, 7, 11 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int sum = i + j;
					if (isPrime(sum)) {
						System.out.print(arr1[k] + " ");
		                k++;
					}
					
				else {
					System.out.print(arr[i][j]+ " ");
				}
			}
			System.out.println();
		}

	}

	static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
		return true;
	}

}
