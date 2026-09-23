package com.logicalstatements.loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int n = sc.nextInt();

		boolean b = palin(n);
	}

	static boolean palin(int n) {
		int sum=0;
		int r=0;
		int temp=n;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum*10+r;
			
		}
		if(temp==sum) {
			System.out.println("this number is palindrome");
		}else {
			System.out.println("this number is not a palindrome");
		
	}
		boolean status = false;
		return status;
		

}
}
