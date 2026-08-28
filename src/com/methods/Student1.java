package com.methods;

public class Student1 {
	//no return type and with parameters
	void getstudentname(String name) {
		System.out.println("studentname is:"+ name);
	}
	void getstudentid(int id) {
		System.out.println("student id is:"+id);
	}
	void getcollegename(String name) {
		System.out.println("college name is:"+name);
	}
	void getphonenumber(Long number) {
		System.out.println("phonenumber is:"+number);
	}
	void getheight(Double height) {
		System.out.println("Height is:"+ height);
	}
	void branchname(String name) {
		System.out.println("branch name is:"+name);
	}

	public static void main(String[] args) {
		Student1 s1=new Student1();
		
		s1.getstudentname("yesu");
		s1.getstudentid(101);
		s1.getcollegename("dnr");
		s1.getphonenumber(9876543210L);
		s1.getheight(5.8);
		s1.branchname("computer science and engineering");

	}

}
