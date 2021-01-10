package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class ITCSEngineer{
	//  it cant extends extends CSEngineer bcz of final class of CSEngineer 
	public Branch branch = Branch.IT;
	
	public void problemSolving() {
		//super.problemSolving();
		System.out.println("invoked problemSolving in ITCSEnginner");
		System.out.println("problem solved by " + this.branch);

	}

	
	public Branch getBranch() {
		return branch;
	}

}
