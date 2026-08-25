package com.fundamentals;

class LibraryBook {

    // Instance variables - different for each book
    int bookId;
    String bookTitle;
    String authorName;
    int availableCopies;

    // Static variables - common for all books
    static String libraryName;
    static String librarianName;

    // Display book details
    void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println("--------------------------");
    }

    // Issue one book
    void issueBook() {
        if (availableCopies > 0) {
            availableCopies--;
            System.out.println(bookTitle + " issued successfully.");
        } else {
            System.out.println(bookTitle + " is not available.");
        }
    }

    // Display common library details
    static void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Librarian Name: " + librarianName);
        System.out.println("--------------------------");
    }

    // Change librarian name
    static void changeLibrarian(String newLibrarianName) {
        librarianName = newLibrarianName;
    }

    public static void main(String[] args) {

        // Assign common library details
        libraryName = "City Central Library";
        librarianName = "Ramesh";

        // Create first book object
        LibraryBook book1 = new LibraryBook();

        book1.bookId = 101;
        book1.bookTitle = "Java Programming";
        book1.authorName = "James Gosling";
        book1.availableCopies = 5;

        // Create second book object
        LibraryBook book2 = new LibraryBook();

        book2.bookId = 102;
        book2.bookTitle = "Database Management";
        book2.authorName = "C. J. Date";
        book2.availableCopies = 3;

        // Display library details
        System.out.println("LIBRARY DETAILS");
        LibraryBook.displayLibraryDetails();

        // Display book details
        System.out.println("BOOK DETAILS");
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Issue one copy of each book
        System.out.println("ISSUING BOOKS");
        book1.issueBook();
        book2.issueBook();

        // Display updated book details
        System.out.println("\nUPDATED BOOK DETAILS");
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Change librarian name
        LibraryBook.changeLibrarian("Suresh");

        // Display updated library details
        System.out.println("UPDATED LIBRARY DETAILS");
        LibraryBook.displayLibraryDetails();
    }
}