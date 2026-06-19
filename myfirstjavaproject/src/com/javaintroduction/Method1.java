package com.javaintroduction;

public class Method1 { // i want to create the 3 static and 3 instance methods and in main method call
						// 1 method it executes 6 methods
	public static void method1() {
		// These are 3 static methods
		System.out.println("This is static method 1");
		Method1 m = new Method1();
		m.imethod1();
		method2();
		m.imethod2();
		method3();
		m.imethod3();
		System.out.println("The main method Ended !!");
	}

	public static void method2() {
		System.out.println("This is static method 2");
	}

	public static void method3() {
		System.out.println("This is static method 3");
		
	}

	public static void main(String[] args) {
		System.out.println("This is main method Started !!");
		method1();

	}

	// These are 3 instance methods
	void imethod1() {
		System.out.println("This is instance method 1");
	}

	void imethod2() {
		System.out.println("This is instance method 2");
	}

	void imethod3() {
		System.out.println("This is instance method 3");
	}

}
