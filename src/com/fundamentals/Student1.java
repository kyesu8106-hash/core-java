package com.fundamentals;

public class Student1 {
	Integer studentid;
	String studentname;
	String gender;
	String branchname;
	String collegename;

	void displaystudentdetails() {
		System.out.println("studentid:" + studentid);
		System.out.println("studentname:" + studentname);
		System.out.println("gender:" + gender);
		System.out.println("branchname:" + branchname);
		System.out.println("collegename:" + collegename);
		System.out.println("-------------------------------------");

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		
		s1.studentid=101;
		s1.studentname="yesu";
		s1.gender="male";
		s1.branchname="cse";
		s1.collegename="dnr";
		

		s2.studentid=102;
		s2.studentname="seshu";
		s2.gender="male";
		s2.branchname="ece";
		s2.collegename="dnr";
		
		System.out.println("main method ended");
		
		s1.displaystudentdetails();
		s2.displaystudentdetails();
		
	}

}
