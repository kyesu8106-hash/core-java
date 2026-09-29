package com.logicalstatements.loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println("main method started!!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int num = n;

		while (num != 1 && num != 4) {
			int sum = 0;

			while (num > 0) {
				int digit = num % 10;
				sum = sum + digit * digit;
				num = num / 10;
			}

			num = sum;
		}
		if (num == 1) {
			System.out.println(n + "is a Happy number");
		} else {
			System.out.println(n + "is not a Happy number");
		}

	}

}
