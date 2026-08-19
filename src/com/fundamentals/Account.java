package com.fundamentals;

public class Account {
	String customerName;
	int accountNumber;
	double accountBalance;
	boolean accountStatus;

	static int nextAccountNumber = 1001;

	Account(String customerName, double accountBalance, boolean accountStatus) {
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.accountStatus = accountStatus;
		this.accountNumber = nextAccountNumber++;
	}

	void displayaccountdetails() {
		System.out.println("customerName:" + customerName);
		System.out.println("accountNumber:" + accountNumber);
		System.out.println("accountBalance:" + accountBalance);
		System.out.println("accountStatus:" + accountStatus);
		System.out.println("------------------------");
	}

	public static void main(String[] args) {
		Account a1 = new Account("Yesu", 25000.00, true);
		Account a2 = new Account("Seshu", 25000.00, true);
		Account a3 = new Account("Sai", 25000.00, false);

		a1.displayaccountdetails();
		a2.displayaccountdetails();
		a3.displayaccountdetails();

	}

}
