package com.fund;

public class BankAccount {
	int accountnumber;
	String accountholdername;
	double balance;
	String branch;

	BankAccount(int accountnumber, String accountholdername, double balance, String branch) {
		this.accountnumber = accountnumber;
		this.accountholdername = accountholdername;
		this.balance = balance;
		this.branch = branch;
	}

	BankAccount(BankAccount b,String branch,Double balance) {
		this.accountnumber = b.accountnumber;
		this.accountholdername=b.accountholdername;
		this.branch=branch;
		this.balance=balance;
	

	}
	BankAccount(BankAccount b1,BankAccount b,int accountnumber,String accountholdername){
		this.balance=b.balance;
		this.branch=b1.branch;
		this.accountnumber=accountnumber;
		this.accountholdername=accountholdername;
		
		
	}
	
	void display(){
		System.out.println("account number:"+accountnumber);
		System.out.println("account holder name: "+accountholdername);
		System.out.println("balance: "+balance);
		System.out.println("branch name: "+branch);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount(4010224, "sri", 10000.00, "jeedmetla");
		BankAccount b1 = new BankAccount(b,"shapur",20000.00);
		BankAccount b2 = new BankAccount(b1,b,30162,"xyz");
	
		b.display();
		b1.display();
		b2.display();

	}

}
