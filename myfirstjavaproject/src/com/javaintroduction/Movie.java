package com.javaintroduction;

public class Movie {
	static  String industryName;
	int movieId;
	String movieName;

	public static void main(String[] args) {
		industryName="Bollywood";
		Movie m=new Movie();
		m.movieId=1000;
		m.movieName="M S Dhoni";
		System.out.println("MovieId:"+m.movieId);
		System.out.println("MovieName:"+m.movieName);
		System.out.println("IndustryName:"+industryName);
		Movie s=new Movie();
		System.out.println();
		s.movieId=2000;
		s.movieName="Salaar";
		s.industryName="Tollywood";
		System.out.println("MovieId:"+s.movieId);
		System.out.println("MovieName:"+s.movieName);
		System.out.println("IndustryName:"+s.industryName);
		
		Movie sh=new Movie();
		System.out.println();
		sh.movieId=3000;
		sh.movieName="JohnWick";
		sh.industryName="Hollywood";
		System.out.println("MovieId:"+sh.movieId);
		System.out.println("MovieName:"+sh.movieName);
		System.out.println("IndustryName:"+sh.industryName);
	}

}
