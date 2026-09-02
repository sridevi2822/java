package com.fund;

public class Employeelogin {
	String empname;
	double salary;
	boolean doorpower;
	boolean blocked;
	
	Employeelogin(boolean doorpower,boolean blocked,String empname,double salary){
		this.blocked=blocked;
		this.doorpower=doorpower;
		this.empname=empname;
		this.salary=salary;
		
	}
	
	void checkAccess() {
		System.out.println(doorpower && (!blocked));
	}
	void display(){
		System.out.println("emp name: "+empname);
		System.out.println("sal of emp: "+salary);
		System.out.println("door power: "+doorpower);
		System.out.println("emp blocked or not: "+blocked);
		checkAccess();
	}

	public static void main(String[] args) {
		
		Employeelogin e = new Employeelogin(false, true,"sri",350000.00);
		Employeelogin e1 = new Employeelogin(true, false,"hema",550000.00);
		
		e.checkAccess();
		e.display();
		
		e1.checkAccess();
		e1.display();
		
		
	}

}
