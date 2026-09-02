package com.fund;

public class Student {
	int stid;
	String studentname;
	String course;
	double fees;
	
	Student(int stid,String studentname,String course,double fees){
		this.stid=stid;
		this.studentname=studentname;
		this.course=course;
		this.fees=fees;			
	}
	Student(Student s,String studentname,String course){
		this.course="python full stack";
		this.studentname="pravs";
		this.stid=102;
		this.fees=s.fees;
		
	}

	public static void main(String[] args) {
		Student s = new Student(101,"sri","javafullstack",27000.0);
		Student s1 = new Student(s,"course","studentname");
		s.display();
		s1.display();
		

	}
	void display() {
		System.out.println("student id: "+stid);
		System.out.println("name: "+studentname);
		System.out.println("course name: "+course);
		System.out.println("fees: "+fees);
	}

}
