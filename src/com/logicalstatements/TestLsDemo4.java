package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a subject: ");
		String subject=sc.nextLine();
		
		System.out.println("Enter the marks: ");
		int marks=sc.nextInt();
		
		if(marks >=35) {
			System.out.println("pass this subject!!");
		}
		else {
			System.out.println("fail this subject!!");
		}

	}

}
