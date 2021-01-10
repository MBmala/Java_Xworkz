package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class ECEngineer extends Engineer{
	
	public Branch branch=Branch.EC;
	
	public void electric()
	{
		System.out.println("invoked electric");
	}
	@Override//annotation
	public void problemSolving() {
		super.problemSolving();
		System.out.println("invoked problemSolving in ECEEnginner");
		System.out.println("problem solved by " + this.branch);

	}
	public Branch getBranch() {
		return branch;
	}
	


}
