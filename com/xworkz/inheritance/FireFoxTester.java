package com.xworkz.inheritance;

import com.xworkz.inheritance.browser.Browser;
import com.xworkz.inheritance.browser.FireFox;

public class FireFoxTester {

	public static void main(String[] args) {

		Object generic = new FireFox();
		// it can access only methods of Object

		Browser browser = new FireFox();
		// it can access only methods of Object & Browser

		FireFox firefox = new FireFox();
		// it can access only methods of Object,Browser & FireFox

		// it is illegal ==>Browser child=new Object();

		/*
		 * instanceOf it checks object is an instance of the specified type or not. it
		 * is used to avoid the ClassCastException
		 */

		generic = new String("test");
		if (generic instanceof FireFox) {
			System.out.println("yes it is fire fox");
			FireFox fireFoxCasted = (FireFox) generic;
			System.out.println(fireFoxCasted.getName());

		} else {
			System.out.println("it is not fire fox");
		}

		if (firefox instanceof FireFox) {
			System.out.println(true);
		}
		FireFox firefox1 = null;
		if (firefox1 instanceof FireFox) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
