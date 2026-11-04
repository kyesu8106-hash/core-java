package com.methodoverriding;

class Delivery {
    int deliveryId;
    String partnerName;
    double distance;

    Delivery(int deliveryId, String partnerName, double distance) {
        this.deliveryId = deliveryId;
        this.partnerName = partnerName;
        this.distance = distance;
    }

    void calculateDeliveryCharge() {
        System.out.println("Delivery Charge Calculation");
    }
}

// Child class 1
class BikeDelivery extends Delivery {

    BikeDelivery(int deliveryId, String partnerName, double distance) {
        super(deliveryId, partnerName, distance);
    }

    @Override
    void calculateDeliveryCharge() {
        double charge = distance * 10;

        System.out.println("\n--- Bike Delivery ---");
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Partner Name: " + partnerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Delivery Charge: Rs." + charge);
    }
}

// Child class 2
class CycleDelivery extends Delivery {

    CycleDelivery(int deliveryId, String partnerName, double distance) {
        super(deliveryId, partnerName, distance);
    }

    @Override
    void calculateDeliveryCharge() {
        double charge = distance * 5;

        System.out.println("\n--- Cycle Delivery ---");
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Partner Name: " + partnerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Delivery Charge: Rs." + charge);
    }
}

// Child class 3
class ExpressDelivery extends Delivery {

    ExpressDelivery(int deliveryId, String partnerName, double distance) {
        super(deliveryId, partnerName, distance);
    }

    @Override
    void calculateDeliveryCharge() {
        double charge = distance * 20;

        System.out.println("\n--- Express Delivery ---");
        System.out.println("Delivery ID: " + deliveryId);
        System.out.println("Partner Name: " + partnerName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Delivery Charge: Rs." + charge);
    }
}

// Main class
public class FoodDelivery {
    public static void main(String[] args) {

        Delivery d1 = new BikeDelivery(101, "Ravi", 5);
        Delivery d2 = new CycleDelivery(102, "Kiran", 4);
        Delivery d3 = new ExpressDelivery(103, "Arjun", 3);

        d1.calculateDeliveryCharge();
        d2.calculateDeliveryCharge();
        d3.calculateDeliveryCharge();
    }
}

