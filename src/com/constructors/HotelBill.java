package com.constructors;

import java.util.Scanner;

public class HotelBill {
	String roomtype;
	int numberofdays;
	double price;
	double charges;
	double cost;
	double finalbill;

HotelBill(String roomtype){
	this(roomtype, 0, 0.0,0.0);
}

HotelBill(String roomtype,int numberofdays){
	this(roomtype,numberofdays,0.0,0.0);
}

HotelBill(String roomtype,int numberofdays,double price){
	this(roomtype,numberofdays,price,0.0);
}

HotelBill(String roomtype,int numberofdays,double price,double charges){
	this.roomtype=roomtype;
	this.numberofdays=numberofdays;
	this.price=price;
	this.charges=charges;
	
	cost=numberofdays*price;
	finalbill=cost+charges;
}

	void display() {
		System.out.println("roomtype is:" + roomtype);
		System.out.println("numberofdays is:" + numberofdays);
		System.out.println("price is:" + price);
		System.out.println(" charges is:" + charges);
		System.out.println("cost is:" + cost);
		System.out.println("finalbill is:" + finalbill);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter roomtype:");
		String roomtype = sc.next();

		System.out.println("enter numberofdays");
		int numberofdays = sc.nextInt();

		System.out.println("enter price");
		double price = sc.nextDouble();

		System.out.println("enter charges");
		double charges = sc.nextDouble();
		
		HotelBill h=new HotelBill(roomtype,numberofdays,price,charges);
		h.display();

	}

}
