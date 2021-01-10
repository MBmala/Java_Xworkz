package com.xworkz.vtu.engineer;

import com.xworkz.vtu.constants.Branch;

public class Engineer {
	public String USN;
	public static Branch branch = Branch.MECH;

	/**
	 * This method will print a statement and will print the default branch i.e MECH
	 */
	public void problemSolving() {
		System.out.println("invoked problemSolving");
		System.out.println("problem solved by " + this.branch);
	}

	public final void bunking() {
		System.out.println("enginner bunked");
	}

}