package com.fundamentals;

class Mobile {

    // Static variable
    static String company = "Samsung";

    // Instance variables
    String brand;
    String model;
    double price;
    int ram;

    // Static block
    static {
        System.out.println("Static Block Executed");
        System.out.println("Mobile Company: " + company);
    }

    // Instance block
    {
        System.out.println("Instance Block Executed");
    }

    // Static method
    static void displayCompany() {
        System.out.println("Company: " + company);
    }

    // Instance method
    void displayMobileDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
        System.out.println("RAM   : " + ram + " GB");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        // Calling static method
        Mobile.displayCompany();

        // Object creation
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        // Assigning values using object references
        m1.brand = "Samsung";
        m1.model = "Galaxy S24";
        m1.price = 79999;
        m1.ram = 8;

        m2.brand = "OnePlus";
        m2.model = "OnePlus 12";
        m2.price = 64999;
        m2.ram = 12;

        m3.brand = "Apple";
        m3.model = "iPhone 16";
        m3.price = 79999;
        m3.ram = 8;

        // Calling instance methods
        m1.displayMobileDetails();
        m2.displayMobileDetails();
        m3.displayMobileDetails();
    }
}