package com.Arrays;

public class RoundFig {

	public static void main(String[] args) {
		int arr[] = {36,45,78,66,99};
		int x=0;
		for(int i=0;i<arr.length;i++) {
			int r =arr[i]%10;
			if(r<=5) {
				x=arr[i]-r;
			}else if(r>5 && r<=9) {
				int sum=10-r;
				x=arr[i]+sum;
			}
			System.out.println(x);
		}

	}

}
