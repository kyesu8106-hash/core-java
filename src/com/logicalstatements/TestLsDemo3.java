package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter salary:");
		double salary=sc.nextDouble();
		
		if(salary>=700000) {
			System.out.println("your package is high");
		}
		else {
			System.out.println("your package is low");
		}

	}

}
