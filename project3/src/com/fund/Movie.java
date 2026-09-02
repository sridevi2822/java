package com.fund;

public class Movie {
	String moviename;
	String hero;
	String heroine;
	double budget;
	
	Movie(String moviename,String hero,String heroine,double budget){
		this.moviename=moviename;
		this.hero=hero;
		this.heroine=heroine;
		this.budget=budget;
	}
	Movie(Movie m,String moviename,String hero){
		this.moviename=moviename;
		this.heroine=m.heroine;
		this.hero="ntr";
		this.budget=m.budget;
	}

	public static void main(String[] args) {
		Movie m = new Movie("varanasi","bob","priyanka",3000000.00);
		m.display();
		Movie m1=new Movie(m,"rrr","hero");
		m1.display();

	}
	void display() {
		System.out.println("movie name: "+moviename);
		System.out.println("hero of movie: "+hero);
		System.out.println("heroine of movie: "+heroine);
		System.out.println("budget of movie: "+budget);
		System.out.println("************************");

	}

}
