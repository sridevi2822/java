package com.logicalstatements.loops;

public class eveoddcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evecount=0;
		int oddcount=0;

		for(int i =100;i>0;i=i-2) {
			evecount++;
			
		}
		System.out.println("count of nos: "+evecount);
		
		for(int i =99;i>0;i=i-2) {
			oddcount++;
			//System.out.println(" "+i);
			
		}
		System.out.println("count of nos: "+oddcount);


	}

}
