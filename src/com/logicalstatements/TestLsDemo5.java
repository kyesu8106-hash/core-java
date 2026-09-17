package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int number=sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("it is a even number");
		}
		else {
			System.out.println("it is odd number: ");
		}
		

	}

}
