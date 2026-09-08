package com.logicalstatements;

import java.util.Scanner;

public class Clothbilling {

	public static void main(String[] args) {
		String yn="";
		double totalprice=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter category...");
			String catg=sc.next();
			
			switch(catg) {
			case "Men" ->{
				String myn="";
				double totalmprice=0;
				do {
					System.out.println("enter item");
					String item=sc.next();
					switch(item) {
					case "Tshirt"->{
						System.out.println("enter size of tshirt");
						String size = sc.next();
						System.out.println("tshirt price is :");
						double tshirtprice=0;
						switch(size) {
						case "S" ->tshirtprice=100;
						case "M"->tshirtprice=100;
						case "L"->tshirtprice=120;
						case "XL"->tshirtprice=120;
						default->System.out.println("entered invalid size");
						}
						System.out.println("tshirt price is: "+tshirtprice);
						totalmprice=tshirtprice+totalmprice;
					}
					case "jeans"->{
						System.out.println("enter jean color: ");
						String color=sc.next();
						System.out.println("enter jean size:");
						String size=sc.next().toUpperCase();
						double jeanprice=0;;
						switch(color) {
						case "blue"->{
							switch(size) {
							case "S"->jeanprice=600;
							case "M"->jeanprice=700;
							case "L"->jeanprice=720;
							case "XL"->jeanprice=800;
							default->System.out.println("entered invalid size");
							}
						}
						case "black"->{
							switch(size) {
							case "S"->jeanprice=700;
							case "M"->jeanprice=750;
							case "L"->jeanprice=750;
							case "XL"->jeanprice=800;
							default->System.out.println("entered invalid size");
							}
						}
						case "biege"->{
							switch(size) {
							case "S"->jeanprice=800;
							case "M"->jeanprice=850;
							case "L"->jeanprice=850;
							case "XL"->jeanprice=800;
							default->System.out.println("entered invalid size");
							}
						}
						case "white"->{
							switch(size) {
							case "S"->jeanprice=650;
							case "M"->jeanprice=700;
							case "L"->jeanprice=720;
							case "XL"->jeanprice=700;
							default->System.out.println("entered invalid size");
							}
						}
						default->System.out.println("Invalid color!!");

						}
						System.out.println("jean price is: "+jeanprice);
						totalmprice=jeanprice+totalmprice;	
					}
					default ->System.out.println("entered wrong item!!");
					}
					System.out.println("do you want to continue with men section..click y for yes and n for no");
					myn=sc.next();
				}while(myn.equalsIgnoreCase("y"));
				System.out.println("total cost for men: "+totalmprice);
				totalprice=totalmprice+totalprice;
				
			}
			case "women" ->{
				String wyn="";
				double totalwprice=0;
				do {
					System.out.println("enter item:");
					String item=sc.next();
					switch(item) {
					case "Lehenga"->{
						System.out.println("the lehenga price is 5000");
						double lehenprice=5000;
						totalwprice=lehenprice+totalwprice;
					}
					case "Frock"->{
						System.out.println("frock cost is 1000");
						double frockprice=1000;
						totalwprice=frockprice+totalwprice;
					}
					case "saree"->{
						System.out.println("cost of saree is 2000");
						double sareeprice=2000;
						totalwprice=sareeprice+totalwprice;
					}
					default -> System.out.println("you have entered wrong category");
					}
					System.out.println("do you want to continue with women section..click y for yes and n for no");
					wyn=sc.next();
				}while(wyn.equalsIgnoreCase("y"));
				System.out.println("tottal price for women: "+totalwprice);
				totalprice=totalwprice+totalprice;
				
			}
			default -> System.out.println("you have entered incorrect item");
			}
			System.out.println("do you want to continue with categorey..click y for yes and n for no");
			yn=sc.next();
			

		}while(yn.equalsIgnoreCase("y"));
		System.out.println("total price is :"+totalprice);

	}

}
