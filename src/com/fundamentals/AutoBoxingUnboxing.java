package com.fundamentals;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		int num=100;
		
		// autoboxing
		Integer integerobj=num;
		//autounboxing
		int newnum=integerobj;
		
		System.out.println("primitive int value:"+num);
		System.out.println("Integer object value:"+integerobj);
		System.out.println("autounboxed int value:"+newnum);

	}

}
