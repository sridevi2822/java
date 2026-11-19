package com.Oops.copy;

class Employee {
	int id;
	String name;
	double sal;
	Address1 address1;

	public Employee(int id, String name, double sal, Address1 address1) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address1 = address1;
	}

	public Employee(Employee emp) {
		this.id = emp.id;
		this.name = emp.name;
		this.sal = emp.sal;
		this.address1 = new Address1(emp.address1);// deep copy
	}

}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1(Address1 address1) {
		this.city = address1.city;

	}

}

public class DeepCopy {

	public static void main(String[] args) {
		Address1 add = new Address1("hyd");
		Employee emp1 = new Employee(1, "sri", 20000.00, add);

		Employee emp2 = new Employee(emp1);
		System.out.println(emp2.id);
		System.out.println(emp2.name);
		System.out.println(emp2.sal);
		System.out.println(emp2.address1.city);

		emp2.address1.city = "bnglr";
		System.out.println(emp2.address1.city);
		System.out.println(emp1.address1.city);

	}

}
