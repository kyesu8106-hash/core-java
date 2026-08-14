package com.fundamentals;

public class Student {
	int student_id = 32;
	String student_name = "yesu";
	int age = 21;
	
	void hello() {
		System.out.println("welcome to college");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Student s1 = new Student();
		s1.hello();
		s1.student_id=31;
		s1.student_name="seshu";
		s1.age=19;
		System.out.println(s1.student_id);
		System.out.println(s1.student_name);
		System.out.println(s1.age);

	}

}
