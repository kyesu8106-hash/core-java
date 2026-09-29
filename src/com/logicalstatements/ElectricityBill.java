package com.logicalstatements;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Connection Type:");
        System.out.println("D - Domestic");
        System.out.println("C - Commercial");

        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);

        String connectionType = "";
        int units;
        double ratePerUnit = 0;
        double totalBill;

        switch (choice) {

            case 'D':
            case 'd':
                connectionType = "Domestic";

                System.out.print("Enter units consumed: ");
                units = sc.nextInt();

                if (units <= 100) {
                    ratePerUnit = 2;
                } 
                else if (units <= 300) {
                    ratePerUnit = 2.50;
                } 
                else {
                    ratePerUnit = 3;
                }

                totalBill = units * ratePerUnit;

                System.out.println("\n--- Electricity Bill ---");
                System.out.println("Connection Type : " + connectionType);
                System.out.println("Units Consumed  : " + units);
                System.out.println("Rate Per Unit   : ₹" + ratePerUnit);
                System.out.println("Total Electricity Bill : ₹" + totalBill);
                break;

            case 'C':
            case 'c':
                connectionType = "Commercial";

                System.out.print("Enter units consumed: ");
                units = sc.nextInt();

                if (units <= 100) {
                    ratePerUnit = 4;
                } 
                else if (units <= 300) {
                    ratePerUnit = 6;
                } 
                else {
                    ratePerUnit = 8;
                }

                totalBill = units * ratePerUnit;

                System.out.println("\n--- Electricity Bill ---");
                System.out.println("Connection Type : " + connectionType);
                System.out.println("Units Consumed  : " + units);
                System.out.println("Rate Per Unit   : ₹" + ratePerUnit);
                System.out.println("Total Electricity Bill : ₹" + totalBill);
                break;

            default:
                System.out.println("Invalid Connection Type!");
        }

        sc.close();
    }
}
