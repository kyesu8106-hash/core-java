package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo15 {

	// WAP to print t-shirt description based on your size
	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter your t-shirt size:");
		int size = sc.nextInt();

		switch (size) {
		case 36 -> System.out.println("the size is small");
		case 38 -> System.out.println("the size is medium");
		case 40 -> System.out.println("the size is large");
		case 42 -> System.out.println("the size is x-large");
		case 44 -> System.out.println("the size is xx-large");
		default -> System.out.println("entered t-shirt is not available");

		}
		System.out.println("main method ended!!");

	}

}
