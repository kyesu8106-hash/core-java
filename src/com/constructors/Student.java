package com.constructors;

public class Student {
	int rollnumber;
	String name;
	int age;

	Student() {
		System.out.println("no arg constructor called");
	}

	Student(int rollnumber, String name, int age) {
		System.out.println("parameterized constructor called");
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;

	}
	public static void main(String[] args) {
		System.out.println("main method started ");

		Student s1 = new Student();

		s1.rollnumber = 101;
		s1.name = "Charan";
		s1.age = 21;
		s1.studentInfo();

		Student s2 = new Student(102, "Eswar", 22);
		s2.studentInfo();

		Student s3 = new Student(103, "Bhanu", 21);
		s3.studentInfo();

		System.out.println("main method ended ");
	}

	private void studentInfo() {
		// TODO Auto-generated method stub
		
	}

	void studentinfo() {
		System.out.println("rollnumber:" + rollnumber);
		System.out.println("name of the student:" + name);
		System.out.println("age of the student:" + age);
	}

}
