package com.xworkz.weapon.impl;

import com.xworkz.weapon.interfaceClasses.BrahmosWeapon;

public class MisselBrahmosWeapon implements BrahmosWeapon,Cloneable {
	private int range;
	
	@Override
	public String toString() {
		return "MisselBrahmosWeapon [range=" + range + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 6;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				System.out.println("obj pointing to same memory");
				return true;
			}
			if (obj instanceof MisselBrahmosWeapon) {
				MisselBrahmosWeapon casted = (MisselBrahmosWeapon) obj;
				if (casted.getRange() > 0 && casted.getRange() == this.range)
					return true;
			} else {
				return false;
			}
		}
		return false;
	}
	@Override
	public MisselBrahmosWeapon clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MisselBrahmosWeapon)super.clone();
	}
	

	@Override
	public void damage() {
		System.out.println("invoked damage in MisselBrahmosWeapon ");
	}

	@Override
	public void abort() {
		System.out.println("invoked abort in MisselBrahmosWeapon ");	
	}

	@Override
	public void attack() {
		System.out.println("invoked attack in MisselBrahmosWeapon ");
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

}
