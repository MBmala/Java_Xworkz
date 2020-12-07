package com.xworkz.ticket_booking;
import java.util.Arrays;

import com.xworkz.ticket_booking.movies.MovieHub;
public class MovieHubTester {
	
	public static void main(String[] args) {

		String[] movieNames= {"PK","Yajamana","KGF","Badla","Fidaa","Guide","Chhalaang","the sky is pink"};
		MovieHub movieHub=new MovieHub("Laxmi",500,movieNames);
         System.out.println("Theater name is: "+movieHub.getTheaterName());
         System.out.println("No of tickets available: "+movieHub.getTotalTickets());
         String names=Arrays.toString(movieHub.getMovieNames());
         System.out.println(names);
         
         movieHub.bookTickets("PK",4,"Mala");
         movieHub.bookTickets("KGF",450,"Mala");
	}

}





