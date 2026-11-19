package com.Oops.copy;

 class Student implements Cloneable{
	int id;
	String name;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

}

 class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class Shallowcopy1 {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address add = new Address("hyderabad");
		Student s1 = new Student(1, "sri", add);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);
		
		Student s2 = (Student) s1.clone();
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
		
		s2.id=2;
		s2.name="devi";
		s2.address.city="bnglr";
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.address.city);
	    System.out.println("************************");
	    System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.address.city);

	}

}
