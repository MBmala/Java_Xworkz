package com.xworkz.weapon;

import com.xworkz.weapon.impl.MachineGunWeapon;

public class Ak47 extends MachineGunWeapon {
	@Override
	public void trigger() {
		System.out.println("invoked trigger in Ak47");
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 8;
	}

}
