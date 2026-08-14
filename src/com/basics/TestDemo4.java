package com.basics;

public class TestDemo4 {
	static void hello() {
		System.out.println("Hello guys,Good morning!");
		System.out.println("Hello guys,Good morning!");
	}
	void welcome() {
		System.out.println("Welcome to vcube!!");
		System.out.println("Welcome to vcube!!");
		System.out.println("Welcome to vcube!!");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		System.out.println(Thread.currentThread());
		TestDemo4 t= new TestDemo4();
		hello();
		t.welcome();
		System.out.println("main method ended");
	}

	

}
