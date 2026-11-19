package com.patterns;

public class PrimePositionPattern {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
			}
		}
	}
	
	static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
				
			}
		}
		return true;
	}

}
