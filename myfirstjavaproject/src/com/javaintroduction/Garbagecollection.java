package com.javaintroduction;

public class Garbagecollection {
	// com.javaintroduction.Garbagecollection@2b2fa4f7
	// com.javaintroduction.Garbagecollection --> this is full pledged class 
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize");
	}
	void scope() {
		Garbagecollection c4=new Garbagecollection();
		System.out.println("This is out of scope "+c4);
	}

	public static void main(String[] args) {
	Garbagecollection c1=new Garbagecollection(); // 2b2fa4f7
	Garbagecollection c2=new Garbagecollection();
	Garbagecollection c3=new Garbagecollection();
     c2=c3;
	 c1=null;
     System.gc();
     System.out.println("This is nullfying :"+c1);
	
	System.out.println("This is re assigning references");
	System.out.println(c2);// 7ad041f3
	System.out.println(c3);// 251a69d7
	Garbagecollection c5=new Garbagecollection();
	c5.scope();
	new Garbagecollection();
	
	
	}

}
