package com.logicalstatements.loops;

import java.util.Random;
import java.util.Scanner;

public class Minigameproject {

	public static void main(String[] args) {
		Random r = new Random();
		int x=r.nextInt(1,10);
		
		Scanner sc = new Scanner(System.in);
		int count=3;
		
		for(int i=1;i<=3;i++) {
			System.out.println("enter number to guess");
			int y=sc.nextInt();
			count--;
			if(x==y) {
				System.out.println("you won!!");
				break;
			}else {
				System.out.println("wrong guess!" + count +"chances left");
			}
			if(count==0) {
				System.out.println("better luck next time");
			}
		}

		
		
		
	}

}
