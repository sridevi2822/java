package com.Oops.abstraction;

public class OrderManagement {

	public static void main(String[] args) {

		Foodorder f = new PizzaOrder(1, "sri", 2);
		f.placeorder();
		f.calculateBill();
		f.displaydetails();

		f = new BurgerOrder(101, "devi", 1);
		f.placeorder();
		f.calculateBill();
		f.displaydetails();

		f = new BiryaniOrder(111, "xyz", 2);
		f.placeorder();
		f.calculateBill();
		f.displaydetails();

	}

}
