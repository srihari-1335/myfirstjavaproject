
package com.javaintroduction;

 class Cskfranchise {
	 static String franchise="Chennai Super Kings";
	 static String jerseyColour="Yellow";
	 String name;
	int jerseyNo;
	public static void main(String[] args) {
		System.out.println("-------- Csk Team Members Info -------");
		Cskfranchise msd = new Cskfranchise();
		msd.name="Mahendra Singh Dhoni";
		msd.jerseyNo=7;
		System.out.println("Franchise Name is:"+franchise);
		System.out.println("JerseyColour is :"+jerseyColour);
		System.out.println("Cricketer Name:"+msd.name);
		System.out.println("Jersey Number :"+msd.jerseyNo);
		System.out.println("--------------------------------");
		Cskfranchise rg = new Cskfranchise();
		rg.name="RutuRaj Gaikwad";
		rg.jerseyNo=31;
		System.out.println("Franchise Name is:"+franchise);
		System.out.println("JerseyColour is :"+jerseyColour);
		System.out.println("Cricketer Name:"+rg.name);
		System.out.println("Jersey Number :"+rg.jerseyNo);
		System.out.println("--------------------------------");
		Cskfranchise rj = new Cskfranchise();
		rj.name="Ravindra Jadeja";
		rj.jerseyNo=8;
		System.out.println("Franchise Name is:"+franchise);
		System.out.println("JerseyColour is :"+jerseyColour);
		System.out.println("Cricketer Name:"+rj.name);
		System.out.println("Jersey Number :"+rj.jerseyNo);
		System.out.println("--------------------------------");
		Cskfranchise db = new Cskfranchise();
		db.name="Dewald Brevis";
		db.jerseyNo=28;
		System.out.println("Franchise Name is:"+franchise);
		System.out.println("JerseyColour is :"+jerseyColour);
		System.out.println("Cricketer Name:"+db.name);
		System.out.println("Jersey Number :"+db.jerseyNo);
		System.out.println("--------------------------------");
	}

}
