package com.logicalstatements.loops;

import java.util.Scanner;

public class PrimeDigitLength {

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (isPrime(n)) {
			int digits = String.valueOf(n).length();

			if (digits == 1) {
				System.out.println(n + " is a single-digit prime number");
			} else if (digits == 2) {
				System.out.println(n + " is a double-digit prime number");
			} else if (digits == 3) {
				System.out.println(n + " is a triple-digit prime number");
			} else {
				System.out.println(n + " is a higher-length prime number");
			}
		} else {
			System.out.println(n + " is not a prime number");
		}

		sc.close();
	}
}