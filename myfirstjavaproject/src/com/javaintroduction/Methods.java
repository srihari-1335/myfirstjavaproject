package com.javaintroduction;

public class Methods {
	public static void method1() {
		System.out.println("This is static method1 man");
		method2();

	}

	public static void method2() {
		System.out.println("This is static method2 man");
		method3();

	}

	public static void method3() {
		System.out.println("This is static method3 man");
		System.out.println("This is End !!");

	}

	void imethod1() {
		System.out.println("This is Instance method1 man");
		Methods m2=new Methods();
		m2.imethod2();

	}

	void imethod2() {
		System.out.println("This is Instance method2 man");
		Methods m3=new Methods();
		m3.imethod3();


	}

	void imethod3() {
		System.out.println("This is Instance method3 man");
		method1();
	}

	public static void main(String[] args) {

		Methods m = new Methods();
		m.imethod1();

	}

}
