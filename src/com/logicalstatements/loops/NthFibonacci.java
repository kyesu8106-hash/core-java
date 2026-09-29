package com.logicalstatements.loops;

import java.util.Scanner;

public class NthFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter N: ");
		int n = sc.nextInt();

		int a = 0, b = 1, c = 0;

		if (n == 1) {
			c = a;
		} else if (n == 2) {
			c = b;
		} else {
			for (int i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
		}

		System.out.println("The " + n + "th Fibonacci number = " + c);

		sc.close();
	}
}
