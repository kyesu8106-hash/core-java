package com.logicalstatements.loops;

public class TestLpDemo2 {

	// WAP to print even and odd numbers from 0 to 100
	public static void main(String[] args) {
		System.out.println("main method started!!");

		System.out.println("even numbers:");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0 && i != 0) {
				System.out.println(i + " ");
			}

		}
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("odd numbers : ");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1 && i != 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println("main method ended!!");

	}

}
