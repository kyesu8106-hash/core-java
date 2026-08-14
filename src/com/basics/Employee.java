package com.basics;

public class Employee {
	{
		System.out.println("instance block called");
	}
static {
	System.out.println("static block called");
}
static Employee e1 = new Employee();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		System.out.println("main method ended");
		

	}

}
