package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class MechEngineer extends Engineer {
	
	
	
	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in MechEnginner");
		System.out.println("problem solved by " + MechEngineer.branch);

	}

	public void design() {
		System.out.println("invoked design in Mech");
	}

	public static Branch getBranch() {
		return branch;
	}

}
