package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo16 {

	// WAP on to print calculation of two numbers & with arithmetic operator symbol.
	public static void main(String[] args) {
		System.out.println("Vcube educational system");
		String yn = "";

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter a first number:");
			double d1 = sc.nextDouble();

			System.out.println("enter a second number:");
			double d2 = sc.nextDouble();

			System.out.println("enter a symbol like + - * / % ");
			String symb = sc.next();

			switch (symb) {
			case "+" -> System.out.println("the sum of two numbers is : " + (d1 + d2));
			case "-" -> System.out.println("the difference of two numbers is:" + (d1 - d2));
			case "*" -> System.out.println("the product of two numbers is:" + (d1 * d2));
			case "/" -> System.out.println("the quotient of two numbers is:" + (d1 / d2));
			case "%" -> System.out.println("the remainder of two numbers is:" + (d1 % d2));
			default -> System.out.println("Invalid symbol is entered please check");
			}
			System.out.println("Do you want to continue..?Click Y for Yes or Click N for No");

			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("you clicked for Exit!!");

	}
}
