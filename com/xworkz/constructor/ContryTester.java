package com.xworkz.constructor;
import com.xworkz.constructor.constructor_exm.Contry;
public class ContryTester {
	public static void main(String[] args) {
	//String noOfStates="29";
	Byte states=Byte.parseByte("29");
		
    Contry country=new Contry("India","New Delhi",states,"Ramnath Kovind","Narendra Modi","Tiger","Peacock",1380004385L);
        
	}
}