package com.xworkz.electronics;

import com.xworkz.electronics.computer.Computer;
import com.xworkz.electronics.computer.DesktopComputer;
import com.xworkz.electronics.computer.Laptop;
import com.xworkz.electronics.constants.Company;

public class ComputerTester {

	public static void main(String[] args) {
		Computer comp = new DesktopComputer();
		comp.displayInfo();

		Computer computer = new Laptop();
		computer.setCompany(Company.HP);
		computer.setPrice(30000);
		computer.setRam("8GB");
		System.out.println(computer.getCompany());
		System.out.println(computer.getPrice());
		System.out.println(computer.getRam());
		String output = computer.process("eclipse", "open");
		System.out.println(output);

		DesktopComputer desktop = new DesktopComputer();
		desktop.setPower(true);
		desktop.turnOn();
		desktop.setPrice(20000);
		desktop.setRam("4GB");
		desktop.setCompany(Company.HCL);
		desktop.displayInfo();

		Laptop laptop = new Laptop();
		output = laptop.process("chrome", "close");
		System.out.println(output);
		laptop.displayInfo();

		// Laptop laptop1=new DesktopComputer(); it is not possible bcz it not extends
		// DesktopComputer

		Computer convert = (Computer) laptop;
		if (convert instanceof Computer) {
			System.out.println(" yes it is instance of Computer");
		} else {
			System.out.println(" No! it is not instance of Computer");
		}
	}

}

/*
 * Computer comp=new Desktop Use Computer as type and create a desktop and
 * laptop use Desktop as type and create a desktop object Use Laptop as type
 * create a laptop object USe Laptop as type create a desktop object
 * 
 * 
 * Convert laptop into computer
 */
