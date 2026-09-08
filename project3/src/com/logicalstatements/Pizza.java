package com.logicalstatements;
import java.util.Scanner;


public class Pizza {
	double price;
	double deliverycharge;
	

	void main(String[] args) {
		System.out.println("welcome to dominoz pizza!!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of pizza");
		char size=sc.next().charAt(0);
		double cost = getpizzaprice(size);
		
		System.out.println("enter quantity: ");
		int quantity=sc.nextInt();
		double pizzacost= calculatepizzacost(cost,quantity);
		
		System.out.println("enter distance: ");
		double distance=sc.nextDouble();
		double deliverycharge=calculatedeliverycharge(distance);
		
		double finalbill=calculatefinalbill(pizzacost,deliverycharge);
		System.out.println("final bill :"+finalbill);
		
		
		
	}
	double getpizzaprice(char size) {
		if (size=='S' ) {
			 return 300;
		}
		else if(size=='M'){
			return 500;
		}
		else if(size=='L'){
			return 700;
		}
		return price;
	}
	
	double calculatepizzacost(double price,int quantity) {
		double totalprice=price*quantity;
		return totalprice;
	}
	double calculatedeliverycharge(double distance) {
		if(distance<=7) {
			System.out.println("no delivery charge");
		}
		else if(distance>=8) {
			return 50;
		}else if(distance>=15) {
			return 100;
		}
		return 0;
	}
	double calculatefinalbill(double price,double deliverycharge) {
		return price+deliverycharge;
	}
	

}
