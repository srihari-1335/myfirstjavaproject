package com.javaintroduction;

public class Methodpara {
	int add(int a,int b) {
		// a=10;
		// b=5;
		 int sum=a+b;
		 return sum;

	}
	int add(int a,int c) {
		// a=10;
		// b=5;
		 int sum=a+c;
		 return sum;

	}
	int mul(int a,int b) {
		// a=10;
		// b=5;
		 int mul=a*b;
		 return mul;

	}
	int div(int a,int b) {
		// a=10;
		// b=5;
		 int div=a/b;
		 return div;

	}

	public static void main(String[] args) {
		Methodpara m=new Methodpara();
		System.out.println("The sum of the variables a and b  is :"+m.add(10,5));
		System.out.println("The substraction of the variables a and b  is :"+m.add(10,7));
		System.out.println("The Multiplication of the variables a and b  is :"+m.mul(10,10));
		System.out.println("The division of the variables a and b  is :"+m.div(10,2));
	}

}
