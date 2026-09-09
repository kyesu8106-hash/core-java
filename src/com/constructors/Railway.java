package com.constructors;

import java.util.Scanner;

class Railway {
	String passengerName;
	int age;
	String source;
	String destination;

	Railway(String passengerName, int age, String source, String destination) {
		this.passengerName = passengerName;
		this.age = age;
		this.source = source;
		this.destination = destination;
	}
}

class Ticket extends Railway {
	int numberOfTickets;
	int price = 500;

	Ticket(String passengerName, int age, String source, String destination, int numberOfTickets) {

		super(passengerName, age, source, destination);

		this.numberOfTickets = numberOfTickets;
	}

	Ticket(String passengerName, int age, String source, String destination) {
		this(passengerName, age, source, destination, 1);
	}

	void bookTicket() {
		int totalAmount = numberOfTickets * price;

		System.out.println("\n===== Ticket Booking =====");
		System.out.println("Ticket booked successfully!");
		System.out.println("Total Amount: Rs." + totalAmount);
	}

	void displayBookingDetails() {
		int totalAmount = numberOfTickets * price;

		System.out.println("\n===== Booking Details =====");
		System.out.println("Passenger Name : " + passengerName);
		System.out.println("Age            : " + age);
		System.out.println("Source         : " + source);
		System.out.println("Destination    : " + destination);
		System.out.println("Number of Tickets : " + numberOfTickets);
		System.out.println("Price per Ticket  : Rs." + price);
		System.out.println("Total Amount      : Rs." + totalAmount);
	}
}

// Main class
class RailwayTicketBooking {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===== Railway Ticket Booking System =====");

		System.out.print("Enter Passenger Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Source: ");
		String source = sc.nextLine();

		System.out.print("Enter Destination: ");
		String destination = sc.nextLine();

		System.out.print("Enter Number of Tickets: ");
		int numberOfTickets = sc.nextInt();

		Ticket t = new Ticket(name, age, source, destination, numberOfTickets);

		t.bookTicket();
		t.displayBookingDetails();

		sc.close();
	}
}