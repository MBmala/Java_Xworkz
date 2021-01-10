package com.xworkz.incomplete.scheme;

public abstract class UnionGovernment {
	//we not able to create object for abstract class
	public UnionGovernment() {
		System.out.println("Created UnionGovernment");
	}

	public void atalPensionYogana() {
		System.out.println("invoked atalPensionYogana");
	}
   /**
   * abstract method does not has body
   * subclass should complete the method
   */
	public abstract void ayushmanBharat();
	// use only protected or public for abstract method	
}


