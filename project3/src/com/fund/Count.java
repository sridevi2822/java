package com.fund;

public class Count {
	static int count=0;
	int id;
	String name;
	Count(){
		
		count++;
	}
	Count(int a,String b){
		this.id=a;
		this.name=b;
		count++;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count c = new Count();
		Count c1 = new Count(101,"xyz");
		System.out.println("count of objs: "+count);
		System.out.println("name: " + c1.name);
		System.out.println("id: "+c1.id);

	}

}

