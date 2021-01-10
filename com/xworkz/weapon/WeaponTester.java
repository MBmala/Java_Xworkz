package com.xworkz.weapon;

import com.xworkz.weapon.impl.MachineGunWeapon;
import com.xworkz.weapon.impl.MisselBrahmosWeapon;
import com.xworkz.weapon.interfaceClasses.BrahmosWeapon;
import com.xworkz.weapon.interfaceClasses.GunWeapon;
import com.xworkz.weapon.interfaceClasses.Weapon;

public class WeaponTester {
	public static void main(String[] args) throws CloneNotSupportedException {

		GunWeapon gunWeapone = new MachineGunWeapon();
		System.out.println(gunWeapone.hashCode());
		System.out.println(gunWeapone.toString());
		System.out.println(gunWeapone.COUNTRY);
		gunWeapone.abort();
		gunWeapone.damage();
		gunWeapone.trigger();
		MachineGunWeapon machineGunWeapon = new MachineGunWeapon();
		machineGunWeapon.setNoOfBullets(10);
		System.out.println(machineGunWeapon.getNoOfBullets());
		System.out.println(machineGunWeapon.equals(gunWeapone));

		System.out.println("--------------------------------------------------");
		BrahmosWeapon brahmosWeapon = new MisselBrahmosWeapon();
		System.out.println(brahmosWeapon.hashCode());
		System.out.println(brahmosWeapon.toString());
		System.out.println(brahmosWeapon.COUNTRY);
		brahmosWeapon.abort();
		brahmosWeapon.damage();
		brahmosWeapon.attack();
		MisselBrahmosWeapon misselbrahmosWeapon = new MisselBrahmosWeapon();
		misselbrahmosWeapon.setRange(30);
		System.out.println(misselbrahmosWeapon.getRange());
		System.out.println(brahmosWeapon.equals(misselbrahmosWeapon));

		MisselBrahmosWeapon cloned = misselbrahmosWeapon.clone();
		System.out.println(cloned.getRange() + " " + cloned.COUNTRY);

		System.out.println("--------------------------------------------------");
		System.out.println(Weapon.COUNTRY);
		Weapon weapon = new MisselBrahmosWeapon();
		weapon.abort();

		System.out.println("--------------------------------------------------");
		Ak47 ak47 = new Ak47();
		ak47.trigger();
		ak47.abort();
		ak47.damage();
		System.out.println(ak47.hashCode());

	}

}
