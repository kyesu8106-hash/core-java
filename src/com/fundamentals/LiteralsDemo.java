package com.fundamentals;

public class LiteralsDemo {

	public static void main(String[] args) {
		// integral literals
		int i1 = 100;
		int i2 = 10;

		// floating literals
		float f1 = 25.75f;
		float f2 = 0123;
		float f3 = 123;
		float f4 = 0123f;

		// char literals
		char grade = 'A';
		char gender = 'M';
		char value = 65;
		char value1 = 69;

		// string literals
		String s1 = "yesu";
		String s2 = "paparao";
		String s3 = "sai";
		String s4 = "murali";

		System.out.println(i1);
		System.out.println(i2);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);

		System.out.println("char literals:" + grade);
		System.out.println("char literals:" + gender);
		System.out.println("char literals:" + value);
		System.out.println("char literals:" + value1);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		

		// boolean literals
		boolean youattendedclassesregularly = true;
		if (youattendedclassesregularly) {
			System.out.println("you will get a job");
		} else {
			System.out.println("you will not get a job");
		}
		

	}

}
