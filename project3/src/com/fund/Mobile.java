package com.fund;

public class Mobile {
	long mobileno;
	String brand;
	String model;
	double price;
	Mobile(long mobileno,String brand,String model,double price){
		this.mobileno=mobileno;
		this.brand=brand;
		this.model=model;
		this.price=price;
		
	}
	Mobile(Mobile b,String model,double price){
		this.mobileno=b.mobileno;
		this.brand=b.brand;
		this.model="z9-pro";
		this.price=price;
	
	}
	
//	Mobile(Mobile b,String model,double price){
//		this.mobileno=b.mobileno;
//		this.brand=b.brand;
//		this.model="z9-pro";
//		this.price=17000.0;
//	
//	}


	public static void main(String[] args) {
		Mobile b = new Mobile(9989679899l,"Iqoo","Z6",14000.0);
		Mobile b1 = new Mobile(b,"model",19000.00);
		//Mobile b1 = new Mobile(b,"model",price);

		b.show();
		b1.show();
		
	}
	void show() {
		System.out.println("mobile no: "+mobileno);
		System.out.println("brand of mobile: " +brand);
		System.out.println("model of mobile: "+model);
		System.out.println("price of mobile: "+price);
		System.out.println("************************");
	}

}
