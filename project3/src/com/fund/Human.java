package com.fund;

public class Human {
	String name;
	int age;
	Human(){
		System.out.println("human constructor called");
	}
	Human(String name,int age){
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		System.out.println("main method started from human");
	}

}

class Person extends Human{
	{
		System.out.println("instance block called");
	}
	Person(){
		super();
		System.out.println("person constructor called");
	}
	Person(String name,int age){
		super(name,age);
		System.out.println("two arg called");
	}

	
	public static void main(String[] args) {
		System.out.println("main method started from person");
		Person p = new Person();
		p.info();
		Person p1 = new Person("sri",21);
		p1.info(); 
		
	}
	void info() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	
}