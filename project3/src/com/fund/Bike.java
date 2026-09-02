package com.fund;

public class Bike {
	String model;
	String brand;
	double price;
	
	
	Bike(){
		this("unknown");
		System.out.println("no-arg constructor called");
	}
	Bike(String model){
		this(model,"kia");
		System.out.println("one - agr constructor called");
		
	}
	Bike(String model,String brand){
		this(model,brand,2000000.00);
		System.out.println("two-arg constructor called");
		
	}
	Bike(String model,String brand,double price){
		System.out.println("three arg constructor called");
		this.model=model;
		this.brand=brand;
		this.price=price;
		
	
	}
	void display() {
		System.out.println("********************");
		System.out.println("model of car: "+model);
		System.out.println("brand of car: "+brand);
		System.out.println("price of car: "+price);


	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b= new Bike();
		b.display();
		Bike b1=new Bike("Ford F-Z");
		b1.display();
		Bike b2=new Bike("classic","bmw");
		b2.display();
		Bike b3=new Bike("Roxx","thar",2500000.00);
		b3.display();


	}

}
