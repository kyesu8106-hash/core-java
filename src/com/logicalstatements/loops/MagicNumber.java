package com.logicalstatements.loops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		int original = n;

		while (n > 9) {
			int sum = 0;

			while (n > 0) {
				sum = sum + (n % 10);
				n = n / 10;
			}

			n = sum;
		}

		if (n == 1) {
			System.out.println(original + " is a Magic Number");
		} else {
			System.out.println(original + " is not a Magic Number");
		}

		sc.close();
	}
}