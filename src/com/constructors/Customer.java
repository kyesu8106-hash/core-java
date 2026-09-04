package com.constructors;
import java.util.Scanner;
public class Customer {
	int cid;
	String name;
	Customer(){
		System.out.println("no-arg constructor called");
		cid=100;
		name="unknown";
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Customer c=new Customer();
		System.out.println(c.cid);
		System.out.println(c.name);
		
		Customer c1=new Customer();
		System.out.println(c.cid);
		System.out.println(c.name);
		
		Scanner sc=new Scanner(System.in);
		
		String s=new String();

	}

}
