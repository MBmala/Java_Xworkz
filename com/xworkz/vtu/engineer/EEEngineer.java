package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class EEEngineer extends Engineer {
	
	public Branch branch = Branch.EEE;// overriding parent variable

	public void problemSolving() {
		System.out.println("invoked problemSolving in EEEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void circuitWiring() {
		System.out.println("invoked circuitWiring ");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}

}
