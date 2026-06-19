package com.javaintroduction;

public class Method2 {
	public static void method1() {
		System.out.println("This is static method 1");
	}
	public static void method2() {
		System.out.println("This is static method 2");
	}

	public static void method3() {
		System.out.println("This is static method 3");
		
	}


	public static void main(String[] args) {
		Method2 m1 = new Method2();
		m1.imethod1();
		
	}
	void imethod1() {
		System.out.println("This is instance method 1");
		//Method1 m = new Method1();// no need to create object when instance method calls the instance method,
		// when the static method is calls the instance method it must create the object then only  we can access the instance method !!!
		imethod2();
		imethod3();
		method1();
		method2();
		method3();
		//m.imethod1();
		
	}

	void imethod2() {
		System.out.println("This is instance method 2");
	}

	void imethod3() {
		System.out.println("This is instance method 3");
	}


}
