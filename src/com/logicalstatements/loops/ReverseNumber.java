package com.logicalstatements.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		
		int reversenumber=reversenumber(n);
		System.out.println("the reverse number is:"+reversenumber);

	}

	private static int reversenumber(int n) {
		int rev=0;
		int r=0;
		int count=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			 rev = rev*10+r;
			 count++;
		}
		System.out.println("the count is:"+count);
		
		
		return rev;
	}

}
