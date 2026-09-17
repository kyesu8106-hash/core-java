package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		
		if(number>0) {
			System.out.println("this is positive number:");
			
		}
		else {
			System.out.println("this is negative number:");
		}
		

	}

}
