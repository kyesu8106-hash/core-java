package com.constructors;
import java.util.Scanner;

//Parent class
class Railway {
 String passengerName;
 int age;
 String source;
 String destination;

 // Parent class constructor
 Railway(String passengerName, int age, String source, String destination) {
     this.passengerName = passengerName;
     this.age = age;
     this.source = source;
     this.destination = destination;
 }
}

//Child class
class Ticket extends Railway {
 int numberOfTickets;
 double price = 500;
 double totalAmount;

 // Constructor 1
 Ticket() {
     this("Unknown", 0, "Unknown", "Unknown", 1);
 }

 // Constructor 2 - constructor chaining using this()
 Ticket(String passengerName, int age, String source,
        String destination, int numberOfTickets) {

     // Calling parent class constructor using super()
     super(passengerName, age, source, destination);

     this.numberOfTickets = numberOfTickets;
 }

 // Method to book ticket
 void bookTicket() {
     totalAmount = numberOfTickets * price;

     System.out.println("\nTicket Booking Successful!");
     System.out.println("Total Ticket Amount: Rs." + totalAmount);
 }

 // Method to display booking details
 void displayBookingDetails() {
     System.out.println("\n----- Booking Details -----");
     System.out.println("Passenger Name : " + passengerName);
     System.out.println("Age            : " + age);
     System.out.println("Source         : " + source);
     System.out.println("Destination    : " + destination);
     System.out.println("No. of Tickets : " + numberOfTickets);
     System.out.println("Price/Ticket   : Rs." + price);
     System.out.println("Total Amount   : Rs." + totalAmount);
 }
}

//Main class
class RailwayTicketBooking {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

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
     int tickets = sc.nextInt();

     // Creating Ticket object
     Ticket t = new Ticket(name, age, source, destination, tickets);

     // Calling methods
     t.bookTicket();
     t.displayBookingDetails();

     sc.close();
 }
}
