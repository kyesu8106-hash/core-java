package com.fundamentals;

public class Movies {
	int movieid;
	String moviename;
	String heroname;
	int availableseats;
	
	static String theatername;
	static String managername;
	
    void displayMovieDetails() {
        System.out.println("Movie ID: " + movieid);
        System.out.println("Movie Name: " + moviename);
        System.out.println("Hero Name: " + heroname);
        System.out.println("Available Seats: " + availableseats);
        System.out.println("---------------------------");
    }
	
    void bookSeat() {
        if (availableseats > 0) {
            availableseats--;
            System.out.println("Seat booked successfully for " + moviename);
        } else {
            System.out.println("No seats available for " + moviename);
        }
    }
    static void displayTheaterDetails() {
        System.out.println("Theater Name: " + theatername);
        System.out.println("Manager Name: " + managername);
        System.out.println("---------------------------");
    }
    static void changeManager(String newManagerName) {
        managername = newManagerName;
    }

	public static void main(String[] args) {
		   theatername = "PVR Cinemas";
	        managername = "Ramesh";
	        
	        Movies m1 = new Movies();
	        m1.movieid = 101;
	        m1.moviename = "Pushpa 2";
	        m1.heroname = "Allu Arjun";
	        m1.availableseats = 50;
	        
	        Movies m2 = new Movies();
	        m2.movieid = 102;
	        m2.moviename = "RRR";
	        m2.heroname = "NTR";
	        m2.availableseats = 40;
	        
	        // Display theater details
	        System.out.println("THEATER DETAILS");
	        Movies.displayTheaterDetails();

	        // Display details of both movies
	        System.out.println("MOVIE DETAILS BEFORE BOOKING");
	        m1.displayMovieDetails();
	        m2.displayMovieDetails();

	        // Book one seat for each movie
	        m1.bookSeat();
	        m2.bookSeat();

	        // Display updated movie details
	        System.out.println("\nMOVIE DETAILS AFTER BOOKING");
	        m1.displayMovieDetails();
	        m2.displayMovieDetails();

	        // Change manager name
	        Movies.changeManager("Suresh");

	        // Display updated theater details
	        System.out.println("UPDATED THEATER DETAILS");
	        Movies.displayTheaterDetails();
	    }
	
	}