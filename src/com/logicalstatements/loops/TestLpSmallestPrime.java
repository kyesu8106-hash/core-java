package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpSmallestPrime {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter starting number:");
		int start = sc.nextInt();

		System.out.println("Enter ending number:");
		int end = sc.nextInt();

		int smallestprime = -1;
		for (int num = start; num <= end; num++) {
			if (num < 2) {
				continue;
			}
			boolean isprime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				smallestprime = num;

			}
		}
		if (smallestprime != -1) {
			System.out.println("smallest prime number=" + smallestprime);

		} else {
			System.out.println("no prime number found in the given range");
		}

	}

}
