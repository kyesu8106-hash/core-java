package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpLargestPrime {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a starting number ");
		int start =sc.nextInt();
		
		System.out.println("Enter a ending number ");
		int end=sc.nextInt();
		
		int largestprime = -1;
		for (int num = start; num <= end; num++) {
			if (num < 2) {
				continue;
			}
			boolean isprime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				largestprime = num;

			}
		}
		if (largestprime!= -1) {
			System.out.println("largest prime number=" + largestprime);

		} else {
			System.out.println("no prime number found in the given range");
		}

	}

}

