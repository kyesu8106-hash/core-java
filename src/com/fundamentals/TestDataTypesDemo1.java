package com.fundamentals;

public class TestDataTypesDemo1 {
	
	byte b=127;
	byte b1=(byte)130;
	
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
		
		System.out.println((int)Math.pow(4, 2));
		
		System.out.println("byte value:"+t.b);
		System.out.println("byte value:"+t.b1);

		
		
		System.out.println("short value:"+t.s);
		System.out.println("int value:"+t.i);
		System.out.println("long value:"+t.l);
		
		System.out.println("float value:"+t.f);
		System.out.println("double value:"+t.d);
		
		System.out.println("char value:"+t.c);
		System.out.println("boolean value:"+t.boo);
		System.out.println("main method ended");
	}

}
