package com.fundamentals;

public class Movie {
	    // Data members
	    String movieName;
	    int releasedYear;
	    double ticketPrice;

	    // Method to display movie details
	    void displayDetails() {
	        System.out.println("Movie Name    : " + movieName);
	        System.out.println("Released Year : " + releasedYear);
	        System.out.println("Ticket Price  : ₹" + ticketPrice);
	        System.out.println("-------------------------");
	    }

	    public static void main(String[] args) {

	        // Creating 3 objects
	        Movie m1 = new Movie();
	        Movie m2 = new Movie();
	        Movie m3 = new Movie();

	        // Assigning different data using object references
	        m1.movieName = "RRR";
	        m1.releasedYear = 2022;
	        m1.ticketPrice = 250;

	        m2.movieName = "Pushpa 2";
	        m2.releasedYear = 2024;
	        m2.ticketPrice = 300;

	        m3.movieName = "Bahubali 2";
	        m3.releasedYear = 2017;
	        m3.ticketPrice = 200;

	        // Displaying details
	        m1.displayDetails();
	        m2.displayDetails();
	        m3.displayDetails();
	    }
	}