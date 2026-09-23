package com.logicalstatements.loops;

public class Alphabets {
	
	static void alpha() {
		
		char character='A';
		
		for(int i=1;i<=26;i++) {
			//System.out.println("alpha: "+character + " " +i);
			//character++;
			if(i%2==0) {
			System.out.println(i+ " " +character);
			}
			character++;

		}
	}

	public static void main(String[] args) {
		alpha();
		

	}

}
