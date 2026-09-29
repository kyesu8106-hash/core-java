package com.logicalstatements.loops;

import java.util.Scanner;

public class LargestPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter starting number: ");
		int start = sc.nextInt();

		System.out.print("Enter ending number: ");
		int end = sc.nextInt();

		int largest = -1;

		for (int n = end; n >= start; n--) {
			if (n < 2)
				continue;

			boolean prime = true;

			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				largest = n;
				break;
			}
		}

		if (largest != -1)
			System.out.println("Largest prime number = " + largest);
		else
			System.out.println("No prime number found.");
	}
}