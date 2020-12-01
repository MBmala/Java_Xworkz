package com.xworkz.constructor.constructor_exm;
public class Contry {
		public String name;
		public String capitalCity;
		public byte noOfStates;
		public String president;
		public String primeMinister;
		public String nationalAnimal;
		public String nationalBird;
		public long population;
	public Contry(String countryName,String capital,byte states,String presidentName,String PM,String animal,String bird,long people)
	{   
		name=countryName;
		capitalCity=capital;
		noOfStates=states;
		president=presidentName;
		primeMinister=PM;				
		nationalAnimal=animal;
		nationalBird=bird;
		population=people;
		
		System.out.println("name of the country: " +name);
		System.out.println("Capital city: " +capitalCity);
		System.out.println("States:" +noOfStates);
		System.out.println("President:" +president);
		System.out.println("Prime minister:" +primeMinister);
		System.out.println("National Animal:" +nationalAnimal);
		System.out.println("National bird:" +nationalBird);
		System.out.println("Population:" +population);
		
	}

}