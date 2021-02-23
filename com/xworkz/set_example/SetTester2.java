package com.xworkz.set_example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTester2 {


	public static void main(String[] args) {
		Set<String> favouritePlaces = new HashSet<String>();
		favouritePlaces.add("Paris");
		favouritePlaces.add("Mauritius");
		favouritePlaces.add(null);//set takes null values
		favouritePlaces.add(null);
		favouritePlaces.add("Bali");
		favouritePlaces.add("Munnar");
		favouritePlaces.add("La");
		favouritePlaces.add("Aus");
		favouritePlaces.add("Paris");
		favouritePlaces.add("Tirupati");
		favouritePlaces.add("Malasyia");
		favouritePlaces.add("Shivamoga");
		favouritePlaces.add("Goa");
		favouritePlaces.add("Malasyia");

		System.out.println(favouritePlaces.size());
		favouritePlaces.forEach(e->System.out.println(e));//unordered
		System.out.println("-----------------------------------------------");
		
		 favouritePlaces = new LinkedHashSet<String>();//ordered
		 favouritePlaces.add("Paris");
			favouritePlaces.add("Mauritius");
			favouritePlaces.add(null);
			favouritePlaces.add(null);
			favouritePlaces.add("Bali");
			favouritePlaces.add("Munnar");
			favouritePlaces.add("La");
			favouritePlaces.add("Aus");
			favouritePlaces.add("Paris");
			favouritePlaces.add("Tirupati");
			favouritePlaces.add("Malasyia");
			favouritePlaces.add("Shivamoga");
			favouritePlaces.add("Goa");
			favouritePlaces.add("Malasyia");
			
			System.out.println(favouritePlaces.size());
			favouritePlaces.forEach(e->System.out.println(e));


	}

}
