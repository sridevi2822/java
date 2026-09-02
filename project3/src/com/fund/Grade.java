package com.fund;
import java.util.Scanner;

public class Grade {
	int marks;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter marks: ");
		int marks=sc.nextInt();
		String result = (marks<0 && marks>100)?"Invalid":(marks>=91 && marks<=100)?"A Grade":(marks>=81 && marks<=90)? "B grade":(marks>=71 && marks<=80)?"C grade":
				(marks>=61 && marks<=70)?"D grade":(marks>=51 && marks<=60)?"E grade":(marks>=35 && marks<=50)?"F grade":"fail";
		
		System.out.println("result "+result);
	

	}

}
