package com.methodoverriding;

//Parent Class
class User {
 String username;
 String password;

 User(String username, String password) {
     this.username = username;
     this.password = password;
 }

 void displayDetails() {
     System.out.println("Username: " + username);
 }
}

//Student Class
class Student extends User {

 Student(String username, String password) {
     super(username, password);
 }

 void submitAssignment() {
     System.out.println(username + " submitted an assignment.");
 }
}

//Instructor Class
class Instructor extends User {

 Instructor(String username, String password) {
     super(username, password);
 }

 void createCourse() {
     System.out.println(username + " created a new course.");
 }
}

//Admin Class
class Admin extends User {

 Admin(String username, String password) {
     super(username, password);
 }

 void manageUsers() {
     System.out.println(username + " is managing users.");
 }
}

//Main Class
public class OnlineLearning {
 public static void main(String[] args) {

     Student s = new Student("Ravi", "12345");

     Instructor i = new Instructor("Kiran", "abc123");

     Admin a = new Admin("Admin1", "admin123");

     System.out.println("----- Student Details -----");
     s.displayDetails();
     s.submitAssignment();

     System.out.println();

     System.out.println("----- Instructor Details -----");
     i.displayDetails();
     i.createCourse();

     System.out.println();

     System.out.println("----- Admin Details -----");
     a.displayDetails();
     a.manageUsers();
 }
}
