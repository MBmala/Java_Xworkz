package com.xworkz.rules;

import com.xworkz.rules.lockdwon.CoronaLockdown;
import com.xworkz.rules.lockdwon.CoronaLockdownImplementor;

public class LockdownTester {

	public static void main(String[] args) {
		CoronaLockdown coronaLockdown=new CoronaLockdownImplementor();
		System.out.println(coronaLockdown.country);
		System.out.println(coronaLockdown.socialDistancing());
		coronaLockdown.wearMask();
		String returnVal=coronaLockdown.sanitize();
		System.out.println(returnVal);
		
		CoronaLockdownImplementor coronaLockdownImplementor=new CoronaLockdownImplementor();
		System.out.println(coronaLockdownImplementor.country);

	}

}
