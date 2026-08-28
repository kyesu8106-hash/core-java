package com.methods;

import java.util.Scanner;

public class Bank {
	double balance = 10000.00;

	public static void main(String[] args) {
		System.out.println("welcome to union bank");
		Bank b=new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Deposit amount is:");
		double amount = sc.nextDouble();
		b.deposit(amount);
		System.out.println("withdraw amount is:");
		double amount1 = sc.nextDouble();
		b.withdraw(amount1);
	}

	void withdraw(double amount) {
		balance = balance - amount;
		showBalance();
	}

	void deposit(double amount) {
		balance = balance + amount;
		showBalance();
	}

	void showBalance() {
		System.out.println("the current balance is:" + balance);
		System.out.println("Thank You!!!");
	}

}
