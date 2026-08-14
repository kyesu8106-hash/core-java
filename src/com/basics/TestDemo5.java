package com.basics;

public class TestDemo5 {
	static void method1() {
		TestDemo5 t = new TestDemo5();
		t.method2();
		System.out.println("method1 called");
	}
	void method2() {
		System.out.println("method2 called");
		method3();
		method4();
	}
	static void method3() {
		System.out.println("method3 called");
	}
	void method4() {
		System.out.println("method4 called");
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		method1();
System.out.println("main method ended");
	}

}
