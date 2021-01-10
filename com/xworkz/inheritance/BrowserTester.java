package com.xworkz.inheritance;

import com.xworkz.inheritance.browser.Browser;

public class BrowserTester {

	public static void main(String[] args) {

		//Syntax of obj creation: data-type ref-var=new Constrctor();
		Browser browser = new Browser();

		browser.setName("IE");

		System.out.println(browser.getName());
		
		//class-name/parent-class-name ref=new Constrctor();
		//Object class is default parent class 
		
		Object genericBrowser=new Browser();//we can access only methods of Object class not from Browser
        
		Browser childRef=(Browser)genericBrowser;//type-casting
		childRef.setName("IE-8");
		System.out.println(childRef.getName());
		
		
		Object day=new String("TUESDAY");
		
		String string=(String)day; //type-casting
		//converting day of type Object to String
		
		//day=new Browser();
		Browser notGoodRef=(Browser)day;// we cant convert day(Object) which is pointing to String into Browser type
		//ClassCastException
				
	}

}