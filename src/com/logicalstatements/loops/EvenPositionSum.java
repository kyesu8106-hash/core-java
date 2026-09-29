package com.logicalstatements.loops;

import java.util.Scanner;

public class EvenPositionSum {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = sc.nextInt();

		int sum = 0;
		int position = 1;
		while (num > 0) {
			// int digit = num % 10;
			// if (position % 2 == 0) {
			// sum = sum + digit;
			int digit = num % 10;
			if (position % 2 != 0) {
				sum = sum + digit;
			}
			num = num / 10;
			position++;
		}
		// System.out.println("sum of digits at even positions:"+sum);
		System.out.println("sum of digits at odd positions:" + sum);
	}
}
