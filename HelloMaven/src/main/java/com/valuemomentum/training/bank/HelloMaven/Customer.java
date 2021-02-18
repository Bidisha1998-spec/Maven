package com.valuemomentum.training.bank.HelloMaven;

public class Customer {
	int accNo;
	String name;
	double balance;
	public Customer(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	void display()
	{
		System.out.println("*******customer details********");
		System.out.println(this.accNo+""+this.balance+""+this.name);
	}

}
