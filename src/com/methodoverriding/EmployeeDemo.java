package com.methodoverriding;

class Employee {

    String employeeName;
    int employeeId;

    Employee(String employeeName, int employeeId) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.monthlySalary = salary;
    }

    void calculateSalary() {
        displayDetails();
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {

    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id,
                     double hourlyRate, int hoursWorked) {

        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    void calculateSalary() {
        displayDetails();

        double salary = hourlyRate * hoursWorked;

        System.out.println("Part-Time Salary: " + salary);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        FullTimeEmployee f =
            new FullTimeEmployee("Ravi", 101, 30000.0);

        PartTimeEmployee p =
            new PartTimeEmployee("Kiran", 102, 200, 80);

        f.calculateSalary();

        System.out.println("----------------");

        p.calculateSalary();
    }
}