package com.xworkz.basics;

public class StringTester {

	public static void main(String[] args) {
		String countryName="India";
		System.out.println("country name:"+countryName);
		
		int size=countryName.length();
		System.out.println("length:"+size);
		
		countryName=countryName.toLowerCase();
		System.out.println("lowercase:"+countryName);
		
		countryName=countryName.toUpperCase();
		System.out.println("uppercase:"+countryName);
		
		char letter=countryName.charAt(2);
		System.out.println("letter at index 2:"+letter);
		
		String about=" is beautiful";
		String concatStr=countryName+about;
		System.out.println("concatStr");
		
		countryName=concatStr.concat("country.");
		System.out.println("concatinated srting:"+countryName);
		
		 String cName=countryName.substring(5);
		System.out.println("sub string:"+cName);
		System.out.println(countryName);
		String desha="India";
		if(countryName==desha) {
			System.out.println("both are same string");
		}
		else {
			System.out.println("both are  not same ");
		}
		
		countryName="";
		boolean value=countryName.isEmpty();
		System.out.println(value);
		
		//countryName=null;
	    //value=countryName.isEmpty();
		//System.out.println(value);
		
			
		
	}

}
