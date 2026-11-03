package com.methodoverriding;

public class Shape {
	void area() {
		System.out.println("Calculating area of shape");
	}
}

class Circle extends Shape {
	double radius = 5;

	@Override
	void area() {
		double result = 3.14 * radius * radius;
		System.out.println("Area of Circle: " + result);
	}
}

class Rectangle extends Shape {
	double length = 10;
	double breadth = 5;

	@Override
	void area() {
		double result = length * breadth;
		System.out.println("Area of Rectangle: " + result);
	}
}

class Main {
	public static void main(String[] args) {

		Circle c = new Circle();
		c.area();

		Rectangle r = new Rectangle();
		r.area();
	}
}
