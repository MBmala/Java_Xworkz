package com.xworkz.concept;

import com.xworkz.concept.staticproblem.Person;

public class StaticTester {

	public static void main(String[] args) {
		//Object
				Person.name="Yash";
				Person.dob="08/01/1986";
				Person.address="Basavangudi";
				
				Person.displayInfo();
				
				Person.name="mala";
				Person.dob="08/01/1998";
				Person.address="Gadag";
				
				Person.displayInfo();
				
				
				Person.name="Alia";
				//Person.dob="31/08/1993"; means it takes previous value
				//Person.address="Mumbai";
				
				Person.displayInfo();
		

	}

}


