package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age:");
		int age=sc.nextInt();
		
		if(age<6) {
			System.out.println("you are a kid");
		}
		else if(age<12) {
			System.out.println("you are a children:");
		}
		else if(age<19) {
			System.out.println("you are a teenager:");
		}
		else if(age<35) {
			System.out.println("you are a youngster:");
		}
		else if(age<60) {
			System.out.println("you are a middle aged man:");
		}
		else {
			System.out.println("you are a oldman70:");
		}

	}

}
