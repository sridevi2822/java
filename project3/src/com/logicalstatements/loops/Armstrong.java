package com.logicalstatements.loops;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int armstrong = arm(n);
		if (armstrong == n) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");
		}

	}

	static int arm(int n) {
		int n1 = n;
		int sum = 0;
		int r = 0;
		int count = 0;
		while (n > 0) {		//n=153				n=15		n=1
			r = n % 10;		//r=153%10=3		r=15%10=5	r=1%10=1
			n = n / 10;		//n=153/10=15		n=15/10=1	n=1/10=0
			count++;		//count=1			count=2		count=3
		}
		while (n1 > 0) {			//n1=153			//n1=15
			int x = n1 % 10;		//x=153%10=3		//x=15%10=5
			n1 = n1 / 10; //		//n1=153/10=15		//n1=15/10=1
//			sum += Math.pow(x, count);
			int product=1;
			for(int i=1;i<=count;i++) {
				product=product*x; //product=1*3=3   p=3*3=9  p=9*3=27   p=1*5 - 5*5 - 5*5*5  p=1*1*1
			}
			sum+=product;//sum=0+27=27 , 27+125+1=153

		}

		return sum;
	}

}
