package com.Arrays;

public class StockPrices {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 9, 6, 5, 7, 19 };

		String s[] = { "sun", "mon", "tues", "wed", "thu", "fri", "sat" };
		String buyDay = "", sellDay = "";
		int max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[j] - arr[i];
				if (temp > max) {
					max = temp;
					buyDay = s[i];
					sellDay = s[j];

				}
				// System.out.println(max);
			}

		}

		System.out.println("maximu profit : " + max);
		System.out.println("buy day: " + buyDay);
		System.out.println("sell day: " + sellDay);

	}

}
