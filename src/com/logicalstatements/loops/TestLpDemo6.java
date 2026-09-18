package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpDemo6 {

	// WAP to print factorial of a given number using for loop
	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number : ");
		int n = sc.nextInt();

		int fact = findFact(n);
		System.out.println("factorial of a given number is: " + fact);
		System.out.println("main method ended!!");

	}

	static int findFact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		// 5*findFact(4)
		// 4*findFact(3)
		// 3*findFact(2)
		// 2*findFact(1)
		return n * findFact(n - 1);

	}

}
