package com.logicalstatements.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		int original = n;
		int temp = n;
		int count = 0;
		while (temp != 0) {
			count++;
			temp = temp / 10;
		}
		temp = n;
		int sum = 0;
		while (temp != 0) {
			int digit = temp % 10;
			int power = 1;
			for (int i = 1; i <= count; i++) {
				power = power * digit;
			}
			sum = sum + power;
			temp = temp / 10;
		}
		if (sum == original) {
			System.out.println(original + "is an ArmstrongNumber");
		} else {
			System.out.println(original + "is not an ArmstrongNumber");
		}
	}

}
