package com.Arrays;

public class Arraynos {

	public static void main(String[] args) {

		int[][] arr = { { 30, 50, 90 }, { 60 }, { 70, 80 }, { 10, 20, 30, 40 } };

		for (int a1[] : arr) {
			for (int a : a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}
