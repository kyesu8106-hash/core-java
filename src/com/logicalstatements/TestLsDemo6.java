package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a age: ");
		int age=sc.nextInt();
		
		if(age>6) {
			System.out.println("you go to school everyday!!");
		}
		else {
			System.out.println("rey bujji neeku inka time undi raa!!");
		}

	}

}
