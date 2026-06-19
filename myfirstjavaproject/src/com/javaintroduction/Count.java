package com.javaintroduction;

// count the number of objects in the program 
public class Count {
	static int count = 0;

	{
		count++;

	}

	public static void main(String[] args) {
		Count a = new Count();
		Count b = new Count();
		Count c = new Count();
		Count d = new Count();

		// System.out.println("Count:"+(count-1));
		System.out.println("The No.of Objects in Program :" + Count.count);

	}
}
