package com.logicalstatements.loops;

import java.util.Scanner;

//fibbinacci series
public class TestLpDemo7 {

	public static void main(String[] args) {
		System.out.println("Fibbinacci series : ");
		Scanner sc = new Scanner(System.in);

		System.out.println("how many numbers you want to print..?");
		int n = sc.nextInt();

		fibonacciseries(n);
	}

	static void fibonacciseries(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 2;
		System.out.println(n1 + "" + n2 + "");// 0 1
		for (int i = 1; i <= n - 2; i++) {
			n3 = n1 + n2;
			System.out.println(n3 + ""); // 1 2 3
			n1 = n2; // 1 2
			n2 = n3; // 2 3
		}
	}

}
