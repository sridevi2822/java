package com.Arrays;

public class MovezeroestoLeft {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 0,0,9, 0, 3};
		int index = arr.length-1;
		for (int i = arr.length-1; i >=0; i--) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
