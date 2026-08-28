package com.fund;

public class Employee {
	String employeename;
	Double salary;
	String companyname;

	Employee(String employeename,double salary,String companyname){
		this.employeename=employeename;
		this.salary=salary;
		this.companyname=companyname;
		
	}

	void display() {
		System.out.println("name: "+employeename);
		System.out.println("salary: "+salary);
		System.out.println("company name: "+companyname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("sri",55000,"dell");
		Employee e1 = new Employee("hema",60000,"xyzz");
		e.display();
		e1.display();
	}
	

}

