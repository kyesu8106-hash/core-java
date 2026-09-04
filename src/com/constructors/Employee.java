package com.constructors;

public class Employee{

	    // Instance variables
	    int id;
	    String name;
	    double salary;

	    // Three-argument constructor
	    Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Another constructor using constructor chaining
	    Employee(int id, String name) {
	        this(id, name, 25000.0); // Calls the three-argument constructor
	    }

	    // Display method
	    void display() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	    }

	    public static void main(String[] args) {

	        // Creating object using three-argument constructor
	        Employee emp1 = new Employee(101, "Yesu", 50000.0);

	        // Creating object using constructor chaining
	        Employee emp2 = new Employee(102, "John");

	        System.out.println("Employee 1 Details:");
	        emp1.display();

	        System.out.println();

	        System.out.println("Employee 2 Details:");
	        emp2.display();
	    }
	}