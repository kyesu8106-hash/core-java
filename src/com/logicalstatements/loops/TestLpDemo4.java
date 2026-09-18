package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpDemo4 {

	// WAP the given number is perfect or not..?
	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = sc.nextInt();

		boolean flag = isperfect(n);
		if (flag) {
			System.out.println("the given number is perfect");
		} else {
			System.out.println("the given number is not perfect");
		}

	}

	static boolean isperfect(int n) {
		boolean status = false;
		int sum = 0; // 6
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println("-------------------------");
		if (sum == n) {
			status = true;
		}
		return status;
	}

}
