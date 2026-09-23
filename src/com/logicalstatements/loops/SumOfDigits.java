package com.logicalstatements.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int sumofdigits = sumofdigits(n);
		System.out.println("sum of digits:" + sumofdigits);

		System.out.println("main method ended!!");

	}

	static int sumofdigits(int n) {
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		return sum;
	}

}
