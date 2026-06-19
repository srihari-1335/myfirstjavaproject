package com.javaintroduction;

public class Methodis {

	void imethod1() { // instance into instance
		System.out.println("This is instance into instance method 1");
		imethod2();

	}

	void imethod2() { // instance into static
		System.out.println("This is instance  method 2");
		method2();
	}

	public static void method1() { // static into instance 
		System.out.println("This is static method 1");
		Methodis m1=new Methodis();
		m1.imethod1();

	}

	public static void method2() { 
		System.out.println("This is static method 2");
		
	}

	public static void main(String[] args) {
		method1();
		

	}

}
