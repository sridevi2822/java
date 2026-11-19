package com.Arrays;

public class Equilibrium {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 2, 2 };
		// int i=0;
		for (int i = 0; i < arr.length - 1; i++) {
			int left = i - 1;
			int right = i + 1;
			int leftsum = 0;
			int rightsum = 0;

			while (left >= 0) {
				leftsum += arr[left];
				left--;
			}
			while (right < arr.length) {
				rightsum += arr[right];
				right++;
			}
			if (leftsum == rightsum) {
				System.out.println(arr[i]);
			}

		}
	}

}
