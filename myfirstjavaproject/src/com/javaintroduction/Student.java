package com.javaintroduction;

    public class Student {
    	static String institueName="Vcube";

    static	Student s=new Student();// when we create an object in class ,it is a legal syntax but it calls infinity times of the instance blocks or variables.
    	static  String stdname="Hari";
 
    	  static { 
    	  System.out.println(" this is static block using static block");
    	    }
    	  
    	{// it is instance block
    		System.out.println("This is Instance Block 1");
    	}
	  
	// int rollno=21;
		public static void main(String[] args) {
		var n=10;// var keyword is used only method ,not in the out of method var is used of any datatype used in method only;
		var name="srihari";
		var percentage=5.666;// first priority is local variable after ,it executes in the order 
				System.out.println(n);
		System.out.println(name);
		System.out.println(percentage);
      
		//Student s=new Student();
	//	System.out.println(s.rollno);
		//System.out.println(s.institueName);
	System.out.println(stdname);
		System.out.println("This is main method Ended ");
	
	

	}
	{
		///*System.out.println(s.rollno);
		System.out.println(Student.institueName);
		//System.out.println(stdname);*/
		System.out.println("This is Instance Block 2");
	}
	

}
