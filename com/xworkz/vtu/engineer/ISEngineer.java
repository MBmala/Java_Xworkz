package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class ISEngineer extends Engineer {
	
	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in ISEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void coding() {
		System.out.println("invoked coding in IS");
	}

	public Branch getBranch() {
		return branch;
	}


}
