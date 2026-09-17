package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo14 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a jersey number:");
		int jno = sc.nextInt();

		switch (jno) {

		case 7:
			System.out.println("mahendra singh dhoni + jersey number is 7");
			System.out.println("cool captain!!");
			System.out.println("thala for a reason!!");
			break;
		case 18:
			System.out.println("virat kohli + jersey number is 18");
			System.out.println("consistent batsman!!");
			System.out.println("aggressive kohli");
			System.out.println("king kohli!!");
			break;
		case 45:
			System.out.println("rohit sharma + jersey number is 45");
			System.out.println("good captain!!");
			System.out.println("good batsman!!");
			break;
		case 3:
			System.out.println("vaibhav soorya vamshi + jersey number is 3");
			System.out.println("buddodu gattodu!!");
			break;
		default:
			System.out.println("entered jersey number is not my favourite!!");
		}
		System.out.println("main method ended!!");
	}
}
