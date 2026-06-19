package com.javaintroduction;

public class Test {
	static Test t=new Test();
	static {
		System.out.println("This is static block ");
	}
	{
		System.out.println("this is Instance Block");
	}

	public static void main(String[] args) {
		System.out.println(" Main method Started ");
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		System.out.println("Main Method Ended here");
	}

}
