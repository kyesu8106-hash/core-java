package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo13 {

	public static void main(String[] args) {
		System.out.println("welcome to vcube matrimonial!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter your name:");
		String fullname = sc.nextLine();

		System.out.println("hello mr. " + fullname + ":Nice to meeet you");
		System.out.println("can you please enter your assets:");
		double asserts = sc.nextDouble();

		System.out.println("can you please enter salary:");
		double salary = sc.nextDouble();

		if (asserts >= 50000000.00 && salary >= 2500000.00) {
			System.out.println("okay! great to know lets continue the discussion");

			System.out.println("Enter your age:");
			int age = sc.nextInt();
			if (age >= 26 && age <= 29) {
				System.out.println("okay to go will discuss more:");

				System.out.println("enter your height:");
				float height = sc.nextFloat();
				if (height >= 5.5 && height <= 6.2) {
					System.out.println("height is matching with our profile:");

					System.out.println("Enter your weight:");
					double weight = sc.nextDouble();
					if (weight >= 65 && weight <= 75) {
						System.out.println("okay!cool!!");

						System.out.println("Do you have siblings ");
						boolean sibStatus = sc.nextBoolean();

						if (!sibStatus) {
							System.out.println("Okay will get back to you later !!");
						} else {
							System.out.println("OMG !!");
						}

					} else {
						System.out.println("You must need to join gym");
						System.out.println("You must need to focus on your fitness ");
					}

				} else {
					System.out.println("You are short or long ");
				}

			} else {
				System.out.println("Sorry your age is not matching with our profile !");
			}

		} else {
			System.out.println("You can leave for the day ");
			System.out.println("Concentrate on your career ");
		}
	}

}
