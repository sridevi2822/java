package com.Arrays;

import java.util.Arrays;

public class MergeTwoarrays {

	public static void main(String[] args) {
		int[] a1= {1,2,3};
		int[] b1= {4,5,6};
		int[] c1= new int[a1.length+b1.length];
//		int[] c1=new int[a1.length];
		for(int i=0;i<a1.length;i++) {
			c1[i]=a1[i];
			
		}
		for(int i=0;i<b1.length;i++) {
//			c1[i]=b1[i];
//			c1[i]=a1[i]+b1[i];
			c1[a1.length + i] = b1[i];
			
		}
		System.out.println(Arrays.toString(c1));
	}

}
