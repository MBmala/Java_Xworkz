package com.xworkz.vtu;

import com.xworkz.vtu.engineer.CSEngineer;
import com.xworkz.vtu.engineer.CivilEngineer;
import com.xworkz.vtu.engineer.Engineer;
import com.xworkz.vtu.engineer.MechEngineer;
import com.xworkz.vtu.engineer.TCEngineer;

public class VTUTester {

	public static void main(String[] args) {

		Engineer engineer = new Engineer();
		System.out.println(engineer.USN);
		System.out.println(engineer.branch);
		engineer.problemSolving();
		
        System.out.println("***********************************************");
		CSEngineer csEngineer = new CSEngineer();
		System.out.println(csEngineer.USN);
		System.out.println(csEngineer.getBranch());
		System.out.println(csEngineer.getParentBranch());
		csEngineer.problemSolving();
		
		 System.out.println("***********************************************");
		Engineer engineer2 = new CSEngineer();
		System.out.println(engineer2.branch);
		CSEngineer csEngineer2 = (CSEngineer) engineer2;
		System.out.println(csEngineer2.branch);
		engineer2.problemSolving();
		
		 System.out.println("***********************************************");
		csEngineer2.problemSolving();
		
		 System.out.println("***********************************************");
		TCEngineer tcEngineer = new TCEngineer();
		System.out.println(tcEngineer.branch);
		tcEngineer.problemSolving();
		System.out.println(tcEngineer.branchIP);
		//tcEngineer.branchIP = Branch.BIOTECH; //bcz of final we cant change value
		
		 System.out.println("***********************************************");
		MechEngineer mechEngineer = new MechEngineer();
		mechEngineer.problemSolving();
		System.out.println(MechEngineer.getBranch());
		//System.out.println(mechEngineer.branch);
		
		CivilEngineer civilEngineer=new CivilEngineer();
		civilEngineer.construction();
		civilEngineer.problemSolving();

	}

}