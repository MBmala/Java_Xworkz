package com.xworkz.weapon.impl;

import com.xworkz.weapon.interfaceClasses.GunWeapon;

public class MachineGunWeapon implements GunWeapon {
	private int noOfBullets;

	@Override
	public String toString() {
		return "MachineGunWeapon [noOfBullets=" + noOfBullets + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				System.out.println("obj pointing to same memory");
				return true;
			}
			if (obj instanceof MachineGunWeapon) {
				MachineGunWeapon casted = (MachineGunWeapon) obj;
				if (casted.getNoOfBullets() > 0 && casted.getNoOfBullets() == this.noOfBullets)
					return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public void damage() {
		System.out.println("invoked damage in MachineGunWeapon ");

	}

	@Override
	public void abort() {
		System.out.println("invoked abort in MachineGunWeapon");

	}

	@Override
	public void trigger() {
		System.out.println("invoked trigger in MachineGunWeapon");

	}

	public int getNoOfBullets() {
		return noOfBullets;
	}

	public void setNoOfBullets(int noOfBullets) {
		this.noOfBullets = noOfBullets;
	}

}
