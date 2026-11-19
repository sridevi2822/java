package com.Arrays;

import java.util.Arrays;

public class ReverseArrayObject {

	static void reverseArray(Object[] arr, int start, int end) {

		Object temp = 0;

		while (start < end) {

			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Object[]) {

				Object[] a = (Object[]) arr[i];

				int right = a.length - 1;
				int left = 0;
				while (left < right) {
					temp = a[right];
					a[right] = a[left];
					a[left] = temp;
					right--;
					left++;

				}
//				arr[i] = a;

			}
		}

//		for (Object a1 : arr) {
//			if (a1 instanceof Object[]) {
//				Object[] a = (Object[]) a1;
//				System.out.print("{ ");
//				for (int i = 0; i < a.length; i++) {
//					System.out.print(a[i] + " ");
//				}
//				System.out.print("} ");
//			} else {
//				System.out.print(a1 + "  ");
//			}
//
//		}

	}

	public static void main(String[] args) {
		Object arr[] = { 10, new Object[] { 10, 20, 30 }, 20, new Object[] { 70, 50, 40 }, 70 };

		int start = 0;
		int end = arr.length - 1;

		reverseArray(arr, start, end);
//		reverseArray(arr,0,arr.length-1);
		 System.out.println(Arrays.deepToString(arr));

	}

}
