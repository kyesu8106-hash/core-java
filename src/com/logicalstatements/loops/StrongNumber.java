package com.logicalstatements.loops;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int original = num;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			int factorial = 1;
			for (int i = 1; i <= digit; i++) {
				factorial = factorial * i;
			}
			sum = sum + factorial;
			num = num / 10;

		}

		if (sum == original) {
			System.out.println(original + "is a strong number");
		} else {
			System.out.println(original + "is not a strong number");

		}

	}

}
