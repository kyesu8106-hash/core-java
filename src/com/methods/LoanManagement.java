package com.methods;

public class LoanManagement {
	// Instance Variables
	String customerName;
	double loanAmount;
	double interestRate;
	int loanTenure; // in years

	// Method to calculate Simple Interest
	double calculateInterest(double loanAmount, double interestRate) {

		double interest = (loanAmount * interestRate * loanTenure) / 100;

		return interest;
	}

	// Method to calculate Total Amount
	double calculateTotalAmount(double interest) {

		double totalAmount = loanAmount + interest;

		return totalAmount;
	}

	// Method to calculate Monthly EMI
	double calculateMonthlyEMI(double totalAmount, int loanTenure) {

		int totalMonths = loanTenure * 12;

		double emi = totalAmount / totalMonths;

		return emi;
	}

	// Method to display Loan Summary
	void displayLoanSummary(double interest, double totalAmount, double emi) {

		System.out.println("\n================================");
		System.out.println("         LOAN SUMMARY");
		System.out.println("================================");

		System.out.println("Customer Name  : " + customerName);
		System.out.println("Loan Amount    : " + loanAmount);
		System.out.println("Interest Rate  : " + interestRate + "%");
		System.out.println("Loan Tenure    : " + loanTenure + " Years");

		System.out.println("--------------------------------");

		System.out.println("Simple Interest: " + interest);
		System.out.println("Total Amount   : " + totalAmount);
		System.out.println("Monthly EMI    : " + emi);

		System.out.println("================================");
	}

	public static void main(String[] args) {

		// Object 1
		LoanManagement customer1 = new LoanManagement();

		customer1.customerName = "Ravi";
		customer1.loanAmount = 500000;
		customer1.interestRate = 8.5;
		customer1.loanTenure = 5;

		// Calling methods for Customer 1
		double interest1 = customer1.calculateInterest(customer1.loanAmount, customer1.interestRate);

		double totalAmount1 = customer1.calculateTotalAmount(interest1);

		double emi1 = customer1.calculateMonthlyEMI(totalAmount1, customer1.loanTenure);

		customer1.displayLoanSummary(interest1, totalAmount1, emi1);

		// Object 2
		LoanManagement customer2 = new LoanManagement();

		customer2.customerName = "Sita";
		customer2.loanAmount = 750000;
		customer2.interestRate = 9.0;
		customer2.loanTenure = 7;

		// Calling methods for Customer 2
		double interest2 = customer2.calculateInterest(customer2.loanAmount, customer2.interestRate);

		double totalAmount2 = customer2.calculateTotalAmount(interest2);

		double emi2 = customer2.calculateMonthlyEMI(totalAmount2, customer2.loanTenure);

		customer2.displayLoanSummary(interest2, totalAmount2, emi2);
	}
}