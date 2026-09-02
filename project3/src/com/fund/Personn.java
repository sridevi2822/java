package com.fund;

public class Personn {
	String name;
	Personn(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		
	}

}
class Stud extends Personn{
	int rollno;
	String course;
	Stud(String name,int rollno,String course){
		super(name);
		this.rollno=rollno;
		this.course=course;
		this.name=name;
		
	}
	
}
class Collegestudent extends Stud{
	String collegename;
	Collegestudent(String name,String collegename,int rollno,String course){
		super(name,rollno,course);
		this.collegename=collegename;
		
		
	}
	public static void main(String[] args) {
		Collegestudent c= new Collegestudent("sri","mlrit",22,"ece");
		c.display();

	}
	void display() {
		System.out.println("name: "+name);
		System.out.println("course : "+course);
		System.out.println("college name: "+collegename);
		System.out.println("roll no: "+rollno);
		
	}


}
