package com.logicalstatements.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		System.out.println("main method started!!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int square = n * n;
		int sum = 0;
		int temp = square;

		while (temp > 0) {
			int digit = temp % 10;
			sum = sum + digit;
			temp = temp / 10;
		}

		if (sum == n) {
			System.out.println(n + " is a Neon Number");
		} else {
			System.out.println(n + " is not a Neon Number");
		}

	}

}
