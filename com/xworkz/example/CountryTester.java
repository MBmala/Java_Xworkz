package com.xworkz.example;

import java.util.Arrays;

import com.xworkz.example.dto.CountryDTO;

public class CountryTester {
	public static void main(String[] args) {

		CountryDTO countryDto = new CountryDTO();
		System.out.println(countryDto.getName());
		System.out.println(countryDto.getPresident());
		
		System.out.println("***************************************************");
		CountryDTO countryDto1=new CountryDTO();
		countryDto1.setName("Switzerland");
		System.out.println(countryDto1.getName());
		countryDto1.setContinent("europe");
		System.out.println(countryDto1.getContinent());
		countryDto1.setPresident("Simonetta Sommaruga");
		System.out.println(countryDto1.getPresident());
		
		System.out.println("***************************************************");
		CountryDTO countryDto2=new CountryDTO("India","Asia",13800043851l,"Narendra Modi","Ramnath Kovind");
		System.out.println(countryDto2.getName());
		System.out.println(countryDto2.getContinent());
		System.out.println(countryDto2.getPopulation());
		System.out.println(countryDto2.getPrimeMinister());
		System.out.println(countryDto2.getPresident());
		
		System.out.println("***************************************************");
		String[] stateNames= {"Andhra Pradesh", "Assam","Arunachal Pradesh", "Bihar", "Goa", "Gujarat", "Jammu and Kashmir","Jharkhand","West Bengal", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Tripura", "Uttaranchal", "Uttar Pradesh", "Haryana", "Himachal Pradesh","Chhattisgarh"};
		String[] language= {"Assamese", "Bengali", "Gujarati", "Hindi", "Kannada", "Kashmiri", "Konkani", "Malayalam", "Manipuri", "Marathi", "Nepali", "Oriya", "Punjabi", "Sanskrit", "Sindhi", "Tamil", "Telugu", "Urdu", "Bodo", "Santhali", "Maithili","Dogri"};
		CountryDTO countryDto3=new CountryDTO("India","Asia",stateNames,13800043851l,"Narendra Modi","Ramnath Kovind",language);
		System.out.println(countryDto3.getName());
		System.out.println(countryDto3.getContinent());
		String state=Arrays.toString(countryDto3.getStates());
		System.out.println(state);
		System.out.println(countryDto3.getPopulation());
		System.out.println(countryDto3.getPrimeMinister());
		System.out.println(countryDto3.getPresident());
		String languageList=Arrays.toString(countryDto3.getLanguages());
		System.out.println(languageList);
		
		System.out.println("***************************************************");
		CountryDTO countryDto4 = new CountryDTO();
		countryDto4.setName("Canada");
		System.out.println("Contry name:"+countryDto4.getName());
		countryDto4.setContinent("America");
		System.out.println("Continent:"+countryDto4.getContinent());
		countryDto4.setPopulation(38005238l);
		System.out.println("Population:"+countryDto4.getPopulation());
		countryDto4.setPresident("Justin Trudeau");
		System.out.println("Precident:"+countryDto4.getPresident());
		
		String[] canadianLanguage=new String[2];
		canadianLanguage[0]="english";
		canadianLanguage[1]="french";
		countryDto4.setLanguages(canadianLanguage);
		String candianLang=Arrays.toString(countryDto4.getLanguages());
		System.out.println("Languages:"+candianLang);
		
	}

}
