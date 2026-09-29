package com.logicalstatements;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== FOOD MENU =====");
		System.out.println("1. Pizza   - ₹200");
		System.out.println("2. Burger  - ₹120");
		System.out.println("3. Biryani - ₹180");
		System.out.println("4. Noodles  - ₹100");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();

		String item = "";
		int price = 0;

		switch (choice) {

		case 1:
			item = "Pizza";
			price = 200;
			break;

		case 2:
			item = "Burger";
			price = 120;
			break;

		case 3:
			item = "Biryani";
			price = 180;
			break;

		case 4:
			item = "Noodles";
			price = 100;
			break;

		default:
			System.out.println("Invalid choice!");
			return;
		}

		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();

		int totalBill = price * quantity;

		System.out.println("\n===== BILL DETAILS =====");
		System.out.println("Selected Item : " + item);
		System.out.println("Price         : ₹" + price);
		System.out.println("Quantity      : " + quantity);
		System.out.println("Total Bill    : ₹" + totalBill);

		sc.close();
	}
}