package com.valuemomentum.training.bank.HelloMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("******banking details*******");
    	Customer c1= new Customer(101,"Raj",5000);
    	c1.display();
    }
}
