package com.javaintroduction;

public class Welcome {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main method Started");
    System.out.println("Welcome to java World");
    // load the class ,for fully qualified name of  classes like java.lang.system...,
    //forName method throws classNotFoundException so we can write that exception
    Class.forName("java.lang.System"); // This is loading the class,These Classes are loaded by Bootstrap Class loader(Whatever classes in jre)
    // why should we load these classes ?-->
    Class.forName("java.lang.String"); 
    Class.forName("com.javaintroduction.Car");
    System.out.println("Main Method Ended");
    Class.forName("com.mysql.cj.jdbc.Driver"); // i want to load the mysql class this is called my reflection api 
               // (it is loaded by )
    
	}

}
