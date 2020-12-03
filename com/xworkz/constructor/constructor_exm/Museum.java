package com.xworkz.constructor.constructor_exm;

public class Museum {
	public String name;
	public String location;
	public String type;

public Museum() {}
public Museum(String museumName,String place,String museumType)
{
	System.out.println("Invoked Museum Constructor");
	name=museumName;
	location=place;
	type=museumType;
	System.out.println("Name of museum ::" +name);
	System.out.println("Location:"+place);
	System.out.println("Museum type" +type);
	
	
}

}

