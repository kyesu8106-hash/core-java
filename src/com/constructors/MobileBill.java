package com.constructors;
import java.util.Scanner;

class MobileBill {

	String mobileModel;
	int quantity;
	double price;
	double deliveryCharge;
	double mobileCost;
	double finalBill;


	MobileBill() {
		this("", 0, 0.0, 0.0);
	}

	MobileBill(String mobileModel) {
		this(mobileModel, 0, 0.0, 0.0);
	}

	MobileBill(String mobileModel, int quantity, double price) {
		this(mobileModel, quantity, price, 0.0);
	}

	MobileBill(String mobileModel, int quantity, double price, double deliveryCharge) {

		this.mobileModel = mobileModel;
		this.quantity = quantity;
		this.price = price;
		this.deliveryCharge = deliveryCharge;

		mobileCost = price * quantity;
		finalBill = mobileCost + deliveryCharge;
	}

	void display() {
		System.out.println("\n----- MOBILE BILL -----");
		System.out.println("Mobile Model    : " + mobileModel);
		System.out.println("Price           : " + price);
		System.out.println("Quantity        : " + quantity);
		System.out.println("Mobile Cost     : " + mobileCost);
		System.out.println("Delivery Charge : " + deliveryCharge);
		System.out.println("Final Bill      : " + finalBill);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Mobile Model: ");
		String model = sc.nextLine();

		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();

		System.out.print("Enter Price: ");
		double price = sc.nextDouble();

		System.out.print("Enter Delivery Charge: ");
		double deliveryCharge = sc.nextDouble();

		// Creating object using constructor
		MobileBill m1 = new MobileBill(model, quantity, price, deliveryCharge);

		m1.display();

	}
}