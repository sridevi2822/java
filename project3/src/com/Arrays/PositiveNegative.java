package com.Arrays;

public class PositiveNegative {

	public static void main(String[] args) {
		
		int[] arr= {1,5,-2,6,-1,2};
//		int[] temp=new int[arr.length];
//		int pindex=0;
//		int positivecount=0;
//		int nindex=0;
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>0) {
//				positivecount++;
//			}
//			nindex=positivecount;
//			pindex=0;
//			}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>0) {
//				temp[pindex]=arr[i];
//				pindex++;
//			}else if(arr[i]<0) {
//				temp[nindex]=arr[i];
//				nindex++;
//
//			}
//		}
//		for(int i=0;i<temp.length;i++) {
//			System.out.println(temp[i]);
//		}
		
		int temp=0;
		int index=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]<0) {
				temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index--;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
