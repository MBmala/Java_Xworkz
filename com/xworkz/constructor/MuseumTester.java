package com.xworkz.constructor;

import com.xworkz.constructor.constructor_exm.Museum;

public class MuseumTester {
	public static void main(String[] args) {
	Museum museum=new Museum("Utsav Rock Garden","Gotagodi,Haveri","Indoor and outdoor sculpture");
	System.out.println("-------------------------------------------------");
	Museum museum1=new Museum();
	 museum1.name="Visvesvaraya Industrial & Tecnological Museum";
	 museum1.location="Bangalore";
	 System.out.println("Name of museum ::" + museum1.name);
	 System.out.println("Location:"+ museum1.location);
	
	}
}
