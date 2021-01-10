package com.xworkz.vtu;

import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.TCEngineer;
import com.xworkz.vtu.engineer.CivilEngineer;

public class Polymorphism {

	public static void main(String[] args) {
		/* parent class reference is used to refer to a child class object.
		 Any Java object that can pass more than one IS-A test is considered to be
		 polymorphic.*/
		Engineer engineer = new CSEngineer();
		Engineer engineer1 = new TCEngineer();
		//engineer = new CivilEngineer();

		engineer.problemSolving();
		engineer1.problemSolving();
		
		engineer = new CivilEngineer();
		engineer.problemSolving();
	}

}
