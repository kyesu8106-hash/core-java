package com.basics;

public class Laptop {
	String name="lenovo";
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
	void m1() {
		System.out.println("m1 called");
		System.out.println("m1 called");
		System.out.println("m1 called");
		System.out.println("m1 called");
		Laptop l2=new Laptop();
		System.out.println(l2.name);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Laptop l1=new Laptop();
		System.out.println(l1);
		Laptop l2=new Laptop();
		System.out.println(l2);
		l2=l1;
		new Laptop().m1();
		System.gc();
		System.out.println(l1);
		System.out.println(l2);

	}

}
