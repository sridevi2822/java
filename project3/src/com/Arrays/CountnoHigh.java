package com.Arrays;

public class CountnoHigh {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 6, 6, 6, 6, 7, 6, 9, 8, 6 };
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}

			}
			if (count > arr.length / 2) {
				num = arr[i];

			}
		}

		if (num != 0) {
			System.out.println(num);
		} else {
			System.out.println("no element found");
		}

	}

}
