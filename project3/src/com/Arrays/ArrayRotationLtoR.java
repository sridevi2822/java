package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationLtoR {

	static void ArrayLtoR(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
		reverseArray(arr, start, end);
		reverseArray(arr, start, r);
		reverseArray(arr, r + 1, end);

	}

	static void reverseArray(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many times to rotate");
		int r = sc.nextInt();
		ArrayLtoR(arr, r);
		System.out.println(Arrays.toString(arr));

	}

}
