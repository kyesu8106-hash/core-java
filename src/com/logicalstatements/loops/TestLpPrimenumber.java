package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpPrimenumber {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int count = 0;

		for (int num = 2; num <= n; num++) {
			boolean isprime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				count++;

			}
		}
		System.out.println("number of prime numbers from 1 to " + n + "=" + count);

	}

}
