package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpDemo3 {

//WAP to print factors/divisors of a given number
	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number: ");
		int n = sc.nextInt();

		findFactors(n);
		System.out.println("main method ended!!");

	}

	static void findFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println(n);
	}

}
