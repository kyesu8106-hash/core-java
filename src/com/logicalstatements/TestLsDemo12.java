package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo12 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a temparature level:");
		float temparature = sc.nextFloat();

		if (temparature > 40) {
			System.out.println("temparature is very high");
		} else if (temparature > 30) {
			System.out.println("temparature is high:");
		} else if (temparature > 20) {
			System.out.println("temparature is normal:");
		} else if (temparature > 10) {
			System.out.println("temparature is cool:");
		} else {
			System.out.println("temparature is very cool:");
		}

	}

}
