package com.basics;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
System.out.println("main method");
System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
System.out.println(Class.forName("com.mysql.cj.jdbc.Clob"));
System.out.println(Class.forName("com.mysql.cj.jdbc.Blob"));
System.out.println(Class.forName("com.mysql.cj.jdbc.EscapeProcessor"));
System.out.println(Class.forName("com.mysql.cj.jdbc.NClob"));
	}
}
