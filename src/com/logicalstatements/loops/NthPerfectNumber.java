package com.logicalstatements.loops;

import java.util.Scanner;

public class NthPerfectNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N:");
		int n = sc.nextInt();

		int count = 0;
		int num = 1;

		while (count < n) {

			int sum = 0;

			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}

			if (sum == num) {
				count++;

				if (count == n) {
					System.out.println("The " + n + "th Perfect Number is: " + num);
				}
			}

			num++;
		}

		sc.close();
	}
}