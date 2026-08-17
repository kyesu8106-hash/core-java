package com.fundamentals;

public class TestDataTypesDemo1 {
	
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	char c;
	boolean boo;

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDataTypesDemo1 t=new TestDataTypesDemo1();
		
		System.out.println(t.b);
		System.out.println(t.s);
		System.out.println(t.i);
		System.out.println(t.l);
		
		System.out.println(t.f);
		System.out.println(t.d);
		
		System.out.println(t.c);
		System.out.println(t.boo);
		System.out.println("main method ended");
	}

}
