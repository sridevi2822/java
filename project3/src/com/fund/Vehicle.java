package com.fund;

public class Vehicle {
	String type;

	Vehicle(String type){
		this.type=type;
	}
	public static void main(String[] args) {

	}
	


}
class Car extends Vehicle{
	String brand;
	double price;
	
	Car(String type,String brand,double price){
	super(type);
	this.brand=brand;
	this.price=price;
	}
	
}
class Electriccar extends Car{
	int batterycapacity;
	
	Electriccar(String type,String brand,double price,int batterycapacity){
		super(type,brand,price);
		this.batterycapacity=batterycapacity;
		System.out.println("electric vehicle called");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electriccar e= new Electriccar("automatic","KIA",500000,4000);
		e.display();

	}
	void display() {
		System.out.println("type of car: "+type);
		System.out.println("brand of car: "+brand);
		System.out.println("price of car: "+price);
		System.out.println("batterycapacity of car: "+batterycapacity);
	}

	
	
}


