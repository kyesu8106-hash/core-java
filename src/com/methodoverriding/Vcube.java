package com.methodoverriding;

class device {
	private String brand;
	private double price;

	public void setbrand(String brand) {
		this.brand = brand;
	}

	public void setprice(double price) {
		this.price = price;
	}

	public String getbrand() {
		return brand;
	}

	public double getprice() {
		return price;
	}

	public void displaydetails() {
		System.out.println("Brand:" + brand);
		System.out.println("Price:" + price);
	}

}

class laptop extends device {
	private int ram;
	private String processor;

	public void setram(int ram) {
		this.ram = ram;
	}

	public void setprocessor(String processor) {
		this.processor = processor;
	}

	public void runIde() {
		System.out.println("laptop is running Ide");
	}

	public void compilecode() {
		System.out.println("code compiled successfully");
	}

	@Override
	public void displaydetails() {
		System.out.println("laptop details:");
		super.displaydetails();
		System.out.println("Ram:" + ram + "GB");
		System.out.println("Processor:" + processor);
	}

}

class mobile extends device {
	private String camera;
	private int battery;

	public void setcamera(String camera) {
		this.camera = camera;

	}

	public void setbattery(int battery) {
		this.battery = battery;
	}

	public void makecall() {
		System.out.println("mobile is a making a call");
	}

	public void takephoto() {
		System.out.println("mobile is taking a photo");
	}

	@Override
	public void displaydetails() {
		System.out.println("mobile details:");
		super.displaydetails();
		System.out.println("camera:" + camera);
		System.out.println("Battery:" + battery + "mah");
	}

}

public class Vcube {
	public static void main(String[] args) {

		// Creating Laptop object
		laptop l = new laptop();

		l.setbrand("Dell");
		l.setprice(65000);
		l.setram(16);
		l.setprocessor("Intel i5");

		// Creating Mobile object
		mobile m = new mobile();

		m.setbrand("Samsung");
		m.setprice(25000);
		m.setcamera("50 MP");
		m.setbattery(5000);

		// Runtime polymorphism
		device d;

		d = l;
		d.displaydetails();

		System.out.println();

		d = m;
		d.displaydetails();

		// Child-specific methods
		System.out.println("\nLaptop Operations:");
		l.runIde();
		l.compilecode();

		System.out.println("\nMobile Operations:");
		m.makecall();
		m.takephoto();
	}
}
