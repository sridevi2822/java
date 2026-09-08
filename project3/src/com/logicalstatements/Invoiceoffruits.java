package com.logicalstatements;

import java.util.Scanner;

public class Invoiceoffruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn="";
		double totalprice=0;
		do {
			System.out.println("Enter categoreyy...");
			String catg=sc.next();
			
			switch(catg) {
			case "Fruits" -> {
				String fyn="";
				double totalfruitcost=0;
				int quantity;
				
				do {
					System.out.println("enter the item");
					String item=sc.next();
					
					switch(item) {
					case "mango" -> {
						System.out.println("mango cost per kg is 160");
						double mngprice=160;
						quantity=2;
						totalfruitcost=(quantity*mngprice)+totalfruitcost;
						
					}
					case "apple" -> {
						 System.out.println("Apple cost per kg is 180");
						 double appleprice = 180;
						 quantity = 1;
						 totalfruitcost = (quantity * appleprice) + totalfruitcost;
					}
					case "banana" -> {
					    System.out.println("Banana cost per dozen is 60");
					    double bananaprice = 60;
					    quantity = 3;
					    totalfruitcost = (quantity * bananaprice) + totalfruitcost;
					}
					case "grapes" -> {
					    System.out.println("Grapes cost per kg is 100");
					    double grapesprice = 100;
					    quantity = 3;
					    totalfruitcost = (quantity * grapesprice) + totalfruitcost;
					}
					default->System.out.println("entered wrong item");
					}
					System.out.println("do you want to continue with fruits..click y for yes and N for no");
					fyn=sc.next();
				}while(fyn.equalsIgnoreCase("y"));
				
				System.out.println("total fuits cost is "+totalfruitcost);
				totalprice=totalfruitcost+totalprice;

				System.out.println("exit from fruits category");
				
			}
			case "veg" ->{
				String vyn="";
				double totalvegcost=0;
				int qntity=0;
				do {
					System.out.println("enter the item");
					String item=sc.next();
					
					switch(item) {
					case "potato" -> {
						System.out.println("potato price per kg is 40rs");
						double potaprice=40;
						qntity=2;
						totalvegcost=(potaprice*qntity)+totalvegcost;
					}
					case "carrot" -> {
					    System.out.println("carrot price per kg is 60rs");

					    double carrotprice = 60;
					    qntity = 1;

					    totalvegcost = (carrotprice * qntity) + totalvegcost;
					}
					case "tomato" -> {
					    System.out.println("tomato price per kg is 50rs");

					    double tomatoprice = 50;
					    qntity = 1;

					    totalvegcost = (tomatoprice * qntity) + totalvegcost;
					}
					case "onion" -> {
					    System.out.println("onion price per kg is 45rs");

					    double onionprice = 45;
					    qntity = 3;

					    totalvegcost = (onionprice * qntity) + totalvegcost;
					}
					case "broccoli" -> {
					    System.out.println("broccoli price per kg is 100rs");

					    double broccoliprice = 100;
					    qntity = 2;

					    totalvegcost = (broccoliprice * qntity) + totalvegcost;
					}
					default -> System.out.println("entered vegetable is wrong!!");
					}
					System.out.println("do you want to continue with vegetables..click y for yes and N for no");
					vyn=sc.next();
					
				}while(vyn.equalsIgnoreCase("y"));
				System.out.println("total price of vegies: "+totalvegcost);
				
				totalprice=totalvegcost+totalprice;
				
			}
			default -> System.out.println("entered category is not available!!!");
			}

			
			System.out.println("do you want to continue with categorey..click y for yes and n for no");
			yn=sc.next();
			
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("total price is: "+totalprice);
	}

}
