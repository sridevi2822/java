package com.Oops.abstraction;

public class PizzaOrder implements Foodorder{
	private int Orderid;
	private String CustomerName;
	private int quantity;
	
	public PizzaOrder(int Orderid,String CustomerName,int quantity) {
		this.Orderid=Orderid;
		this.CustomerName=CustomerName;
		this.quantity=quantity;
	}
	
	public void placeorder() {
		System.out.println("Pizza order placed..");
	}
	
	public int calculateBill() {
//		System.out.println("the total bill is: " +(250*quantity));
		return 250*quantity;
	}
	
	public void displaydetails() {
		System.out.println("the orderid is: "+Orderid);
		System.out.println("customer name: "+CustomerName);
		System.out.println("total bill is:" + calculateBill());
	}
	

}
