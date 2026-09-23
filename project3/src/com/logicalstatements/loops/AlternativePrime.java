package com.logicalstatements.loops;

public class AlternativePrime {

	static boolean isPrime(int n) {
       if(n==1||n==0)return false;
       
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static void alphabet() {
		char character='A';
		for(int i=1;i<=26;i++) {
			if(isPrime(i)) {
				System.out.println(i+ " " +character);

			}
			character++;

		}
	}

	public static void main(String[] args) {
//       System.out.println("main mthod started ");
//       int count=0;
//       for(int i=1;i<=100;i++) {
//    	   if(isPrime(i)) {
//    		   if(count%2==0) {
//    			   System.out.print(i +" ");
//    		   }
//    		   count++;
//
//    	   }
//       }
       alphabet();
	}

}
