package com.Arrays;

import java.util.Arrays;

public class MatrixTranspose {

	public static void main(String[] args) {
		int[][] arr = new int[2][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		
		int a[][]=new int [2][2];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				a[j][i]=arr[i][j];
				System.out.print(a[i][j] + " ");

			}
////			System.out.print(a + " ");
//			System.out.println();


		}
		System.out.println();
			System.out.println(Arrays.deepToString(a));
	}

}
