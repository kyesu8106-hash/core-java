package com.logicalstatements.loops;

import java.util.Scanner;

public class CountPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = sc.nextInt();

		int count = 0;

		for (int num = 2; num <= n; num++) {

			boolean isPrime = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				count++;
			}
		}

		System.out.println("Number of prime numbers from 1 to " + n + " is: " + count);
	}
}