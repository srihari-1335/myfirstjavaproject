package com.javaintroduction;

public class Employee {
	static String institute;
	static String coachingArea; // static variable(which is used to static keyword)
	int empId; // instance variable(only write inside class outside methods,constructors,blocks(it has collection of statements))
	String ename;
	int esalary;
	String department;
	int empno;
	String empna;
	int roll;
	public static void main(String[] args) {
		Employee hari = new Employee();
		// int empid=107,it is local variable only write inside the methods ......
		hari.empId = 1000;
		hari.ename = "srihari";
		hari.esalary = 50000;
		hari.department = "JFS";
		institute = "Vcube";
		coachingArea = "Hyderabad";
		System.out.println("--------First Employee Details-----------");
		System.out.println("Coaching Area:" + coachingArea);
		System.out.println("Institute Name :" + institute);
		System.out.println("Employee Id:" + hari.empId);
		System.out.println("Employee Name:" + hari.ename);
		System.out.println("Employee Id:" + hari.esalary);
		System.out.println("Employee Department:" + hari.department);
		System.out.println(hari.empno);
		System.out.println(hari.empna);
		System.out.println(hari.roll);
		System.out.println("----------Second Employee Details------------");
		Employee surya = new Employee();
		System.out.println("Coaching Area:" + coachingArea);
		System.out.println("Institute Name :" + institute);
		surya.empId = 2000;
		surya.ename = "Surya";
		surya.esalary = 60000;
		surya.department = "PFS";
		System.out.println("Employee Id:" + surya.empId);
		System.out.println("Employee Name:" + surya.ename);
		System.out.println("Employee Id:" + surya.esalary);
		System.out.println("Employee Department:" + surya.department);

	}

}
