package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public final class CSEngineer extends Engineer {

	public Branch branch = Branch.CS;// overriding parent variable

	public void problemSolving() {
		//runtime polymorphism (overriding method)
		super.problemSolving();
		System.out.println("invoked problemSolving in CSEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	public void coding() {
		System.out.println("invoked coding in CS");
	}

	public Branch getBranch() {
		return branch;
	}

	public Branch getParentBranch() {
		return super.branch;
	}
}
