package com.Arrays;

public class NegativePositiveAlternate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, -1, 5, 4, -6, -3 };
		int[] temp = new int[arr.length];

		int positiveindex = 0;
		int negativeindex = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				temp[positiveindex] = arr[i];
				positiveindex = positiveindex + 2;

			} else if (arr[i] < 0) {
				temp[negativeindex] = arr[i];
				negativeindex = negativeindex + 2;
			}

		}
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
