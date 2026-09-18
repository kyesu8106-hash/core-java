package com.logicalstatements.loops;

import java.util.Scanner;

public class TestLpDemo5 {
	
    //WAP to print factorial of a given number using for loop(Long)
	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		
		Long fact=findFact(n);
		System.out.println("factorial of a given number is: " + fact);
		System.out.println("main method ended!!");

	}
	static Long findFact(int n) {
		Long fact=(long) 1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}
