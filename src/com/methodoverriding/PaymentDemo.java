package com.methodoverriding;

class Payment {
	String customername;
	double amount;

	Payment(String customername, double amount) {
		this.customername = customername;
		this.amount = amount;
	}

	void makepayment() {
		System.out.println("payment details!!");
	}

	class UpiPayment extends Payment {
		String upiid;

		UpiPayment(String customername, double amount, String Upiid) {
			super(customername, amount);
			this.customername = Upiid;
		}
		@Override
	    void makepayment() {
	        System.out.println("\n--- UPI Payment ---");
	        System.out.println("Customer: " + customername);

	        if (upiid.matches("[a-zA-Z0-9._-]+@[a-zA-Z]+")) {
	            System.out.println("UPI ID: " + upiid);
	            System.out.println("Amount: Rs." + amount);
	            System.out.println("UPI Payment Successful!");
	        } else {
	            System.out.println("Invalid UPI ID!");
	        }
	    }
	}

class Cardpayment extends Payment {
	String cardnumber;
	String cvv;

	Cardpayment(String customername, double amount, String cardnumber, String cvv) {
		super(customername, amount);
		this.cardnumber = cardnumber;
		this.cvv = cvv;

	}
	 @Override
	    void makepayment() {
	        System.out.println("\n--- Card Payment ---");
	        System.out.println("Customer: " + customername);

	        if (cardnumber.matches("\\d{16}") &&
	            cvv.matches("\\d{3}")) {

	            System.out.println("Card Number: XXXX-XXXX-XXXX-"
	                    + cardnumber.substring(12));
	            System.out.println("Amount: Rs." + amount);
	            System.out.println("Card Payment Successful!");
	        } else {
	            System.out.println("Invalid Card Number or CVV!");
	        }
	    }
	}

class CashPayment extends Payment {
	double cash;

	CashPayment(String customername, double amount,double cash) {
		super(customername, amount);
		this.amount=amount;
	}
	@Override
    void makepayment() {
        System.out.println("\n--- Cash Payment ---");
        System.out.println("Customer: " + customername);
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


public class PaymentDemo {

	public static void main(String[] args) {

		        Payment p1 = new Payment(
		                "Yesu", 1000);

		        Payment p2 = new Payment(
		                "Ravi", 2000);

		        Payment p3 = new Payment(
		                "Krishna", 500);

		        p1.makepayment();
		        p2.makepayment();
		        p3.makepayment();
		    }
		}
	}
