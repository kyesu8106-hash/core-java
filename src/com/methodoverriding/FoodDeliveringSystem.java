package com.methodoverriding;

abstract class FoodOrder {

	abstract void calculateBill();

	abstract void prepareOrder();
}

// Child class 1
class PizzaOrder extends FoodOrder {

	int quantity = 2;
	double price = 250;

	@Override
	void calculateBill() {
		double total = quantity * price;
		System.out.println("Pizza Bill: Rs. " + total);
	}

	@Override
	void prepareOrder() {
		System.out.println("Preparing Pizza...");
		System.out.println("Pizza is ready!");
	}
}

// Child class 2
class BurgerOrder extends FoodOrder {

	int quantity = 3;
	double price = 100;

	@Override
	void calculateBill() {
		double total = quantity * price;
		System.out.println("Burger Bill: Rs. " + total);
	}

	@Override
	void prepareOrder() {
		System.out.println("Preparing Burger...");
		System.out.println("Burger is ready!");
	}
}

// Child class 3
class BiryaniOrder extends FoodOrder {

	int quantity = 2;
	double price = 180;

	@Override
	void calculateBill() {
		double total = quantity * price;
		System.out.println("Biryani Bill: Rs. " + total);
	}

	@Override
	void prepareOrder() {
		System.out.println("Preparing Biryani...");
		System.out.println("Biryani is ready!");
	}
}

// Main class
public class FoodDeliveringSystem {

	public static void main(String[] args) {

		FoodOrder f;

		f = new PizzaOrder();
		f.calculateBill();
		f.prepareOrder();

		System.out.println("-------------------");

		f = new BurgerOrder();
		f.calculateBill();
		f.prepareOrder();

		System.out.println("-------------------");

		f = new BiryaniOrder();
		f.calculateBill();
		f.prepareOrder();
	}
}
