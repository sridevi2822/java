package com.fund;

public class Product {
	int productid;
	String pname;
	String category;
	double price;
	Product(int productid,String pname,String category,double price){
		this.productid=productid;
		this.pname=pname;
		this.category=category;
		this.price=price;
	}
	Product(Product p,String category,double price){
		this.productid=p.productid;
		this.pname=p.pname;
		this.category="phones";
		this.price=price;
	}
	Product(Product p1,Product p,int productid){
		this.productid=productid;
		this.pname="headset";
		this.category=p1.category;
		this.price=p.price;
	}
	

	public static void main(String[] args) {
		Product p = new Product(101,"buds","electronics",40000.00);
		Product p1 = new Product(p,"category",2000.0);
		Product p2 = new Product(p1,p,102);
		p.display();
		p1.display();
		p2.display();

	}
	void display() {
		System.out.println("*************");
		System.out.println("product id: "+productid);
		System.out.println("product name: "+pname);
		System.out.println("category: "+category);
		System.out.println("price of product: "+price);

	}

}
