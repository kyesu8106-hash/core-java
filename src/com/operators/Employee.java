package com.operators;

public class Employee {

	    // Class-level (Instance) variables
	    String employeeName;
	    double salary;
	    String companyName;

	    // Constructor
	    Employee(String employeeName, double salary, String companyName) {

	        // Assign local values to class-level variables
	        this.employeeName = employeeName;
	        this.salary = salary;
	        this.companyName = companyName;
	    }

	    // Display method
	    void display() {
	        System.out.println("Employee Name: " + employeeName);
	        System.out.println("Salary: " + salary);
	        System.out.println("Company Name: " + companyName);
	        System.out.println("------------------------");
	    }

	    public static void main(String[] args) {

	        // Creating objects and passing values
	        Employee emp1 = new Employee("Ravi", 30000, "TCS");
	        Employee emp2 = new Employee("Sita", 45000, "Infosys");

	        // Displaying object data
	        emp1.display();
	        emp2.display();
	    }
	}