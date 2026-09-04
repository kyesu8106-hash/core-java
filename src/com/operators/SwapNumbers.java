package com.operators;

public class SwapNumbers {

	public static void main(String[] args) {

		// Original values
		int a = 10;
		int b = 20;

		System.out.println("Before Swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Swapping using Temporary Variable
		int temp = a;
		a = b;
		b = temp;

		System.out.println("\nAfter Swapping using Temporary Variable:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Reset values
		a = 10;
		b = 20;

		// Swapping using Arithmetic Operators
		a = a + b; // 10 + 20 = 30
		b = a - b; // 30 - 20 = 10
		a = a - b; // 30 - 10 = 20

		System.out.println("\nAfter Swapping using Arithmetic Operators:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}