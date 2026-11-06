package com.methodoverriding;


class Payment {
    String customerName;
    double amount;

    Payment(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    void makePayment() {
        System.out.println("Payment Details");
    }
}

// UPI Payment
class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String name, double amount, String upiId) {
        super(name, amount);
        this.upiId = upiId;
    }

    @Override
    void makePayment() {
        System.out.println("\n--- UPI Payment ---");
        System.out.println("Customer: " + customerName);

        if (upiId.matches("[a-zA-Z0-9._-]+@[a-zA-Z]+")) {
            System.out.println("UPI ID: " + upiId);
            System.out.println("Amount: Rs." + amount);
            System.out.println("UPI Payment Successful!");
        } else {
            System.out.println("Invalid UPI ID!");
        }
    }
}

// Card Payment
class CardPayment extends Payment {
    String cardNumber;
    String cvv;

    CardPayment(String name, double amount,
                String cardNumber, String cvv) {
        super(name, amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    void makePayment() {
        System.out.println("\n--- Card Payment ---");
        System.out.println("Customer: " + customerName);

        if (cardNumber.matches("\\d{16}") &&
            cvv.matches("\\d{3}")) {

            System.out.println("Card Number: XXXX-XXXX-XXXX-"
                    + cardNumber.substring(12));
            System.out.println("Amount: Rs." + amount);
            System.out.println("Card Payment Successful!");
        } else {
            System.out.println("Invalid Card Number or CVV!");
        }
    }
}

// Cash Payment
class CashPayment extends Payment {
    double cash;

    CashPayment(String name, double amount, double cash) {
        super(name, amount);
        this.cash = cash;
    }

    @Override
    void makePayment() {
        System.out.println("\n--- Cash Payment ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Bill Amount: Rs." + amount);
        System.out.println("Cash Given: Rs." + cash);

        if (cash >= amount) {
            double balance = cash - amount;

            System.out.println("Payment Successful!");
            System.out.println("Remaining Balance: Rs." + balance);
        } else {
            System.out.println("Insufficient Cash!");
            System.out.println("Short Amount: Rs."
                    + (amount - cash));
        }
    }
}

// Main Class
public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment(
                "Yesu", 1000, "yesu@okaxis");

        Payment p2 = new CardPayment(
                "Ravi", 2000, "1234567812345678", "123");

        Payment p3 = new CashPayment(
                "Krishna", 500, 700);

        p1.makePayment();
        p2.makePayment();
        p3.makePayment();
    }
}
