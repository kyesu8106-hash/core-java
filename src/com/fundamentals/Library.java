package com.fundamentals;

public class Library {

	    // Variables
	    int bookId;
	    String bookTitle;
	    String authorName;
	    int availableCopies;
	    String libraryName;
	    String librarianName;

	    // Method to display all book details
	    void displayBookDetails() {
	        System.out.println("Book ID          : " + bookId);
	        System.out.println("Book Title       : " + bookTitle);
	        System.out.println("Author Name      : " + authorName);
	        System.out.println("Available Copies : " + availableCopies);
	    }

	    // Method to display library details
	    void displayLibraryDetails() {
	        System.out.println("Library Name     : " + libraryName);
	        System.out.println("Librarian Name   : " + librarianName);
	    }

	    // Method to change librarian name
	    void changeLibrarian(String newLibrarianName) {
	        librarianName = newLibrarianName;
	    }

	    public static void main(String[] args) {

	        // Create two LibraryBook objects
	        Library book1 = new Library();
	        Library book2 = new Library();

	        // Assign values to book1
	        book1.bookId = 101;
	        book1.bookTitle = "Java Programming";
	        book1.authorName = "James Gosling";
	        book1.availableCopies = 5;
	        book1.libraryName = "Central Library";
	        book1.librarianName = "Ravi";

	        // Assign values to book2
	        book2.bookId = 102;
	        book2.bookTitle = "Database Management System";
	        book2.authorName = "Korth";
	        book2.availableCopies = 3;
	        book2.libraryName = "Central Library";
	        book2.librarianName = "Ravi";

	        // Display book1 details
	        System.out.println("===== BOOK 1 DETAILS =====");
	        book1.displayBookDetails();
	        book1.displayLibraryDetails();

	        System.out.println();

	        // Display book2 details
	        System.out.println("===== BOOK 2 DETAILS =====");
	        book2.displayBookDetails();
	        book2.displayLibraryDetails();

	        // Change librarian
	        book1.changeLibrarian("Suresh");

	        System.out.println();
	        System.out.println("===== AFTER CHANGING LIBRARIAN =====");
	        book1.displayLibraryDetails();
	    }
	}