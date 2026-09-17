package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		
		if(age<6) {
		System.out.println("you are a kid: ");

	}
		else {
			System.out.println("you are not a kid: ");
		}
	}
}
