package com.methods;

public class ZoomCarRentals {
	    // 1. Return company name
	    public String getCompanyName() {
	        return "ZoomCar Rentals";
	    }

	    // 2. Return fixed daily rental rate
	    public double getDailyRentalRate() {
	        return 1500;
	    }

	    // 3. Calculate base rental cost
	    public double calculateBaseRentalCost(int days) {
	        return days * getDailyRentalRate();
	    }

	    // 4. Return fixed insurance fee
	    public double getInsuranceFee() {
	        return 500;
	    }

	    // 5. Calculate total cost
	    public double calculateTotalCost(int days) {
	        double baseCost = calculateBaseRentalCost(days);
	        return baseCost + getInsuranceFee();
	    }

	    // 6. Return welcome message
	    public String getWelcomeMessage() {
	        return "Welcome to ZoomCar Rentals!";
	    }

	    // Main method
	    public static void main(String[] args) {

	        ZoomCarRentals customer = new ZoomCarRentals();

	        int days = 3;

	        System.out.println(customer.getWelcomeMessage());
	        System.out.println("Company Name: " + customer.getCompanyName());
	        System.out.println("Daily Rental Rate: ₹" 
	                            + customer.getDailyRentalRate());
	        System.out.println("Number of Days: " + days);
	        System.out.println("Base Rental Cost: ₹" 
	                            + customer.calculateBaseRentalCost(days));
	        System.out.println("Insurance Fee: ₹" 
	                            + customer.getInsuranceFee());
	        System.out.println("Total Cost: ₹" 
	                            + customer.calculateTotalCost(days));
	    }
	}
