package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a cahracter:");
		char character = sc.next().charAt(0);

		if (character >= 'A' && character <= 'Z') {
			System.out.println("this is uppercase letter");
		} else {
			System.out.println("this is lowercase letter");
		}
	}
}
