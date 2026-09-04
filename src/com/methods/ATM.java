package com.methods;

public class ATM {

	// Static Variable
	// Common for all ATM account objects
	static String bankName = "State Bank of India";

	// Instance Variables
	int accountNumber;
	double balance;

	// Method to deposit money
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited Amount: " + amount);
	}

	// Method to withdraw money
	void withdraw(double amount) {

		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn Amount: " + amount);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	// Method to check balance
	void checkBalance() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {

		// Creating first ATM account object
		ATM account1 = new ATM();

		account1.accountNumber = 1001;
		account1.balance = 5000;

		// Deposit and withdrawal for account1
		account1.deposit(2000);
		account1.withdraw(1000);

		// Display balance
		account1.checkBalance();

		// Creating second ATM account object
		ATM account2 = new ATM();

		account2.accountNumber = 1002;
		account2.balance = 10000;

		// Deposit and withdrawal for account2
		account2.deposit(3000);
		account2.withdraw(2500);

		// Display balance
		account2.checkBalance();
	}
}