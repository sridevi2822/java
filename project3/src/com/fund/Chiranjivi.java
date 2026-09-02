package com.fund;

public class Chiranjivi {
	String moviename;
	int moviecount;
	//if parent class has only parameterized constructor then other class which extends this parent class gives 
	//compilation error that means other classes cannot extend this parent class,so thats why it is necessary to create no-arg
	//constructor in parent class.
	
	
	Chiranjivi(){
		System.out.println("chiranjivi constructor called");
	}
	Chiranjivi(String moviename,int moviecount){
		this.moviename=moviename;
		this.moviecount=moviecount;
	}

	public static void main(String[] args) {
		Chiranjivi ch=new Chiranjivi();
		Chiranjivi ch1=new Chiranjivi("Tagore",50);
		ch.show();
		ch1.show();

	}
	void show() {
		System.out.println("movie name: "+moviename);
		System.out.println("movie count: "+moviecount);
	}


}
class Ramcharan extends Chiranjivi{
	Ramcharan(String moviename,int moviecount){
		super(moviename,moviecount);

	}

	public static void main(String[] args) {
		Ramcharan r = new Ramcharan("xyzzz",25);
		r.show();
		

	}

}
