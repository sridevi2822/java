package com.Arrays;

public class Frequencycount {

	public static void main(String[] args) {
		int[] a= {1,1,9,1,2,2,7,9,9,7};
		boolean[] b=new boolean[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(b[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[j]=true;
					count++;
				}
			}
			System.out.println(a[i]+ " " +count);
		}

	}

}
