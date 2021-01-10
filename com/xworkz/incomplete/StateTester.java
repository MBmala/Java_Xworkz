package com.xworkz.incomplete;

import com.xworkz.incomplete.scheme.UnionGovernment;
import com.xworkz.incomplete.states.KarnatakaGovernment;

public class StateTester {

	public static void main(String[] args) {
		
		UnionGovernment government=new KarnatakaGovernment();
		government.atalPensionYogana();
		/**
		 * we can't able to create object of abstract class
		 * UnionGovernment government=new UnionGovernment();
		 */
		
		Integer inte=new Integer(9);
		Object obj=new Object();
		
		/**
		 * Number num=new Number(2);
		 * Number is abstract class
		 */
		
		
		Number number=new Integer(56);
		number =new Double(78);
		

	}

}
