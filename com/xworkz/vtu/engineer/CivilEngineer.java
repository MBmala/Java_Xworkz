package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class CivilEngineer extends Engineer {
	
	public Branch branch=Branch.CIVIL;
	
	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in CivilEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void construction() {
		System.out.println("invoked construction");
	}

}