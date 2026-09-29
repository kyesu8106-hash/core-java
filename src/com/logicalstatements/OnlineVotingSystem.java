package com.logicalstatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== ONLINE VOTING SYSTEM =====");

		// Ask age
		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		// Check age eligibility
		if (age < 18) {

			System.out.println("Not Eligible for Voting");

		} else {

			// Ask gender only if age is eligible
			System.out.print("Enter your gender (M/F): ");
			char gender = sc.next().charAt(0);

			// Check gender
			if (gender != 'M' && gender != 'F' && gender != 'm' && gender != 'f') {

				System.out.println("Not Eligible for Voting");

			} else {

				// Ask voter ID only if gender is eligible
				System.out.print("Enter your Voter ID No: ");
				String voterIdNo = sc.next();

				System.out.println("\n===== CANDIDATES =====");
				System.out.println("1. Mark Antony");
				System.out.println("2. John Peter");
				System.out.println("3. David Kumar");
				System.out.println("4. Robert Wilson");

				System.out.print("\nPress any option to vote: ");
				int option = sc.nextInt();

				// Display vote result
				switch (option) {

				case 1:
					System.out.println("Vote is Captured for Mark Antony");
					break;

				case 2:
					System.out.println("Vote is Captured for John Peter");
					break;

				case 3:
					System.out.println("Vote is Captured for David Kumar");
					break;

				case 4:
					System.out.println("Vote is Captured for Robert Wilson");
					break;

				default:
					System.out.println("Thanks for Voting To NOTA");
				}
			}
		}

		sc.close();
	}
}