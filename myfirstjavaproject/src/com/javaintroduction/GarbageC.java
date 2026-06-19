package com.javaintroduction;

public class GarbageC {
	
 // com.javaintroduction.GarbageC@2b2fa4f7--> fully qualified class (which is package.class)
// System.gc is used for manually to run garbage collection 
// gc is the static method from System Class which is used to collect the garbage manually !!!
	@Override
		protected void finalize() throws Throwable { 
// Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.
		System.out.println("The Garbage Collected !!!");
			
		}
	void outOfScope(){// object inside a method
		 GarbageC g3= new GarbageC();
		 System.out.println("This is 3Rd Garbage collector  method ");
	}
	void welcome() {
		System.out.println("welcome to Garbage Collection");
	}
	public static void main(String[] args) {
     GarbageC g1= new GarbageC();
    GarbageC g2= new GarbageC();
    GarbageC g4= new GarbageC();
     g1= null;// i)this is first method of garbage collection ,nullifying object 
     GarbageC g5= new GarbageC();
     g5=g2;// ii)this is 2nd method of gc re-assigning the references objects 
     g4.outOfScope();//iii)this is 3rd method out of scope
     new GarbageC().welcome();;//iv) this is 4th method Anonymous Object(These are eligible for garbage collection)
     System.gc(); // Systeem.gc when we write this then jvm sends to finalize method there is no more reference objects so you excute it.
     // The gc method is checks how many garbage values are avilable in the program .
     System.out.println(g1); // 2b2fa4f7
     System.out.println(g2);// It is initial address:1dbd16a6 after g1 is null then g1  address to g2 is assigned automatically so 2b2fa4f7
     
         

	}
}
