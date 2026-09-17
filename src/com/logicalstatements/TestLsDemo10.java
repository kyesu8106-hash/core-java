package com.logicalstatements;

import java.util.Scanner;

public class TestLsDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your marks:");
		int marks=sc.nextInt();
		
		if(marks>90) {
			System.out.println("grade A");
			
		}
		else if(marks>80) {
			System.out.println("grade B");
			
		}
		else if(marks>70) {
			System.out.println("grade C");
		}
		else if(marks>60) {
			System.out.println("grade D");
			
		}
		else if(marks>50) {
			System.out.println("grade E");
		}
		else {
			System.out.println("you are a fail");
		}
	}

}
