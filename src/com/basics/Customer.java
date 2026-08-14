package com.basics;

public class Customer extends Object {
	static Customer c=new Customer();
	
	protected void finalize() {
		System.out.println("finalize method called!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		System.out.println(c);
		Customer c1=new Customer();
		System.out.println(c1);
		Customer c2=new Customer();
		System.out.println(c2);
		Customer c3=new Customer();
		System.out.println(c3);
		c1=null;
		c2=null;
		c3=null;
		System.gc();
		
	}

}
