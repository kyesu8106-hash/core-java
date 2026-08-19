package com.fundamentals;

public class Employee2 {
	int employeeId;
	String employeeName;
	double salary;
	int experience;
	char grade;
	boolean permanentStatus;

	void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Salary: " + salary);
		System.out.println("Experience: " + experience + " years");
		System.out.println("Grade: " + grade);
		System.out.println("Permanent Status: " + permanentStatus);
		System.out.println("----------------------------");
	}

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		Employee2 e2 = new Employee2();
		Employee2 e3 = new Employee2();

		e1.employeeId = 101;
		e1.employeeName = "Yesu";
		e1.salary = 35000.50;
		e1.experience = 2;
		e1.grade = 'A';
		e1.permanentStatus = true;

		e2.employeeId = 102;
		e2.employeeName = "Seshu";
		e2.salary = 35000.50;
		e2.experience = 3;
		e2.grade = 'A';
		e2.permanentStatus = true;

		e3.employeeId = 103;
		e3.employeeName = "Ravi";
		e3.salary = 35000.50;
		e3.experience = 2;
		e3.grade = 'B';
		e3.permanentStatus = false;
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();

	}

}
