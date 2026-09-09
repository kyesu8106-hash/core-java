package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();

	if(age>=18) {
		System.out.println("congratulations!!");
		System.out.println("you are eligible for voting and driving!!");
	}else {
		System.out.println("babu bujji neeku inka time undi raa!!");
		System.out.println("have a good day!!");
	}

}
}
