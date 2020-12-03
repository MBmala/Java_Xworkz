package com.xworkz.initialization;
import com.xworkz.initialization.init.Temple;

public class TempleTester {
	public static void main(String[] args) {
		Temple temple;
		temple=new Temple("Sai baba","shiradi",6.00f,"Puliyogare",8.00f);
		//assigning return value from getter method to local variable
		String name=temple.getName();
		String place=temple.getLocation();
		//float startTime=temple.getOpenTime();
		String prasad=temple.getPrasada();
		//float close=temple.getCloseTime();
		
		System.out.println("Temple name: "+name);
		System.out.println(place);
		//System.out.println(startTime);
		System.out.println(prasad);
		//System.out.println(close);
		prasad="laadu";
        temple.setPrasada(prasad);
        prasad=temple.getPrasada();
		System.out.println("updated prasada "+prasad);
		

	}

}




