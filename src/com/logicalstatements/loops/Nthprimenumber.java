package com.logicalstatements.loops;

import java.util.Scanner;

public class Nthprimenumber {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		int count = 0;
		int num = 1;

		while (count < 2) {
			num++;
			boolean isprime = true;
			if (num < 2) {
				isprime = false;
			}
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				count++;
			}

		}
		System.out.println("the" + n + "th prime number is:" + num);

	}

}
