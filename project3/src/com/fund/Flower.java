package com.fund;

public class Flower {
	String name="jasmine";
	String color="white";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
class Rose extends Flower{
	String name="rose";
	String color="red";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		Rose r = new Rose();
		r.roseinfo();
	}
	void roseinfo() {
		System.out.println("name of the flower: "+name);
		System.out.println("color of thr flower : "+color);
		System.out.println("**************************");
		System.out.println("name of the flower: "+super.name);
		System.out.println("color of thr flower : "+super.color);

	}
}
