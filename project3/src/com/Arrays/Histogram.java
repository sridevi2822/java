package com.Arrays;

public class Histogram {

	public static void main(String[] args) {
		int product = 0;
		int max = 0;

		int[] heights = { 2, 1, 5, 6, 2, 3 };  //length=6
		for (int i = 0; i < heights.length; i++) {//0 1  2  3  4
			int left = i - 1;//-1  0  1  2  3
			int right = i + 1;//1  2  3  4  5
			int count = 1;
			while (left >= 0 && heights[left] >= heights[i]) {
				count++;//2  //2 3
				left--;//2 1
			}
			while (right < heights.length && heights[right] >= heights[i]) {
				count++;//3  4  5 6  //2  //4
				right++;// 3  4  5  6  //4  //6
			}
			product = count * heights[i];//1*2=2  6*1=6  2*5=10   1*6   4*2
			if (product > max) {
				max = product;//2  6  10  
			}

		}
		System.out.println(max);

	}

}
