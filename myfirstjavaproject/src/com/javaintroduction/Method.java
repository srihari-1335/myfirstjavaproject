package com.javaintroduction;

public class Method {
	void imethod1() {
		System.out.println("This is instance method 1");
		method2();
	}

	void imethod2() {
		System.out.println("This is instance method 2");
		method3();
	}

	void imethod3() {
		System.out.println("This is instance method 3");
		method4();
	}

	void imethod4() {
		System.out.println("This is instance method 4");
		method5();
	}

	void imethod5() {
		System.out.println("This is instance method 5");
		
	}

	public static void main(String[] args) {
		System.out.println("<---------Main Method Started --------->");
		method1();
		System.out.println("<---------Main Method ended------------>");

	}

	public static void method1() {
		System.out.println("This is static method 1");
		Method m1 = new Method();
		m1.imethod1();

	}

	public static void method2() {
		System.out.println("This is static method 2");
		Method m2 = new Method();
		m2.imethod2();
		
	}

	public static void method3() {
		System.out.println("This is static method 3");
		Method m3 = new Method();
		m3.imethod3();

	}

	public static void method4() {
		System.out.println("This is static method 4");
		Method m4 = new Method();
		m4.imethod4();
	}

	public static void method5() {
		System.out.println("This is static method 5");
		Method m5=new Method();
		 m5.imethod5();
		// System.out.println("-------------------------------------------");
	}

}
