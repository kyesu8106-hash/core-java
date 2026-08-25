package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNumberDemo {

	public static void main(String[] args) {

		// BigInteger values
		BigInteger number1 = new BigInteger("987654321012345678901234567890");

		BigInteger number2 = new BigInteger("123456789098765432109876543210");

		BigInteger bigIntegerResult = number1.add(number2);

		// BigDecimal values
		BigDecimal price1 = new BigDecimal("1500.75");
		BigDecimal price2 = new BigDecimal("2500.25");

		BigDecimal bigDecimalResult = price1.add(price2);

		// Display results
		System.out.println("First BigInteger: " + number1);
		System.out.println("Second BigInteger: " + number2);
		System.out.println("BigInteger Addition: " + bigIntegerResult);

		System.out.println();

		System.out.println("First BigDecimal: " + price1);
		System.out.println("Second BigDecimal: " + price2);
		System.out.println("BigDecimal Addition: " + bigDecimalResult);
	}

}
