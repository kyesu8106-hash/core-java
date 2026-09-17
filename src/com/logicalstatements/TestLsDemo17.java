package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo17 {

	public static void main(String[] args) {
		System.out.println("welcome to vegetable/fruit market");
		Scanner sc = new Scanner(System.in);

		double totalprice = 0;
		double fruprice = 0;
		double vegprice = 0;

		String yn = "";
		do {
			System.out.println("enter the category ");
			String catg = sc.next();
			switch (catg) {
			case "veg" -> {
				String vyn = "";

				do {
					System.out.println("enter a item");
					String item = sc.next();
					switch (item) {
					case "ptt" -> {
						System.out.println("the potato per kg price is 40rs");
						double potatoprice = 40.0;
						vegprice = vegprice + potatoprice;
					}
					case "onn" -> {
						System.out.println("the onion per kg price is 30rs");
						double onionprice = 30.0;
						vegprice = vegprice + onionprice;
					}
					case "bjl" -> {
						System.out.println("the brinjal per kg price is 45rs");
						double brinjalprice = 45.0;
						vegprice = vegprice + brinjalprice;
					}
					case "tmt" -> {
						System.out.println("the tomoto per kg price is 60rs");
						double tomotoprice = 60.0;
						vegprice = vegprice + tomotoprice;
					}
					case "crt" -> {
						System.out.println("the carrot per hg price is 40rs");
						double carrotprice = 40.0;
						vegprice = vegprice + carrotprice;
					}
					default -> System.out.println("entered vegetable is not available:");
					}
					System.out.println("Do you want to continue with vegetable click Y or N");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));
				System.out.println("exit from the vegetables!!");
				System.out.println("Total vegetables price is : " + vegprice);
			}
			case "fru" -> {
				String fyn = "";
				do {
					System.out.println("enter fruit name : ");
					String item = sc.next();
					switch (item) {
					case "app" -> {
						System.out.println("the apple per kg price is 120rs");
						double appleprice = 120.0;
						fruprice = fruprice + appleprice;
					}
					case "orn" -> {
						System.out.println("the orange per kg price is 100rs");
						double orangeprice = 100.0;
						fruprice = fruprice + orangeprice;
					}
					case "man" -> {
						System.out.println("the mango per kg price is 150rs");
						double mangoprice = 150.0;
						fruprice = fruprice + mangoprice;
					}
					case "bnn" -> {
						System.out.println("the banana per kg price is 80rs");
						double bananaprice = 80.0;
						fruprice = fruprice + bananaprice;
					}
					case "gps" -> {
						System.out.println("the grapes per kg price is 100rs");
						double grapesprice = 100.0;
						fruprice = fruprice + grapesprice;
					}
					default -> {
						System.out.println("entered fruit is not available:");
					}

					}
					System.out.println("Do you want to continue with fruits..?");
					fyn = sc.next();

				} while (fyn.equalsIgnoreCase("y"));
				System.out.println("Exit for the fruits : ");
				System.out.println("Total frits price is : " + fruprice);

			}
			default -> System.out.println("entered category is not available is now!!");
			}
			System.out.println("Do you want to continue with categories click Y or N exit..?");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("total price is : " + (vegprice + fruprice));

	}

}
