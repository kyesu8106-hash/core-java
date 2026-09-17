package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		
		if(name.length()>=15) {
			System.out.println("your name not allowed in this application!!");
		}
		else {
			System.out.println("your name is allowed in this application!!");
		}

	}

}
