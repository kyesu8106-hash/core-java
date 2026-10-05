package com.logicalstatements.loops;

import java.util.Scanner;

public class EvenDigitCount {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int count = 0;
		while (n != 0) {
			int digit = n % 10;
			// if (digit % 2 == 0) {
			// count++;
			// }
			if (digit % 2 != 0) {
				count++;
			}
			n = n / 10;
		}
		// System.out.println("number of even digits=" + count);
		System.out.println("number of odd digits=" + count);

	}

}
