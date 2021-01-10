package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class TCEngineer extends Engineer {
	public Branch branch = Branch.TC;
	public final Branch branchIP = Branch.IP;

	//method overriding
	public void problemSolving() {
		System.out.println("invoked problemSolving in TCEnginner");
		System.out.println("problem solved by " + this.branch);

	}
	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}

}