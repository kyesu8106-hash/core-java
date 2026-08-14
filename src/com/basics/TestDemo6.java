package com.basics;

public class TestDemo6 {
	void method1() {
		method2();
		System.out.println("method1 called");
	}
	void method2() {
		method3();
		System.out.println("method2 called");
		
	}
	void method3() {
		method4();
		System.out.println("method3 called");
	}
	void method4() {
		System.out.println("method4 called");
		method5();
	}
	void method5() {
		System.out.println("method5 called");
		method6();
	}
	void method6() {
		System.out.println("method6 called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		int a = 10;
		int b = 20;
		System.out.println("a + b");
		TestDemo6 t = new TestDemo6();
		t.method1();
		
		
		System.out.println("main method ended");
		

	}

}
