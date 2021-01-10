package com.xworkz.clone.dto;

public class ZooDTO {
	private String name;
	private int noOfAnimals;
	private boolean open;
	private double entryFees;
	private boolean safari;

	public ZooDTO() {
		System.out.println("invoked ZooDTO");
	}

	public ZooDTO(String name, int noOfAnimals, boolean open, double entryFees, boolean safari) {
		super();
		this.name = name;
		this.noOfAnimals = noOfAnimals;
		this.open = open;
		this.entryFees = entryFees;
		this.safari = safari;
	}

	@Override
	public String toString() {
		return "ZooDTO [name=" + name + ", noOfAnimals=" + noOfAnimals + ", open=" + open + ", entryFees=" + entryFees
				+ ", safari=" + safari + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				System.out.println("obj pointing to same memory");
				return true;
			}
			if (obj instanceof PalaceDTO) {
				ZooDTO casted = (ZooDTO) obj;
				if (casted.getName() != null && casted.getName().equals(this.name))
					System.out.println(" name is same");
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashCode method");
		return 10;
	}

	/**
	 * this method returns all properties of ZooDTO
	 * 
	 * @Override public ZooDTO clone() throws CloneNotSupportedException {
	 *           System.out.println("invoked clone method"); return
	 *           (ZooDTO)super.clone(); }
	 */

	@Override
	public ZooDTO clone() throws CloneNotSupportedException {
		System.out.println("invoked clone method");
		ZooDTO dto = new ZooDTO();
		// for shallow copy
		dto.name = this.name;
		dto.noOfAnimals = this.noOfAnimals;
		dto.open = this.open;
		return dto;
	}

	public String getName() {
		return name;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public boolean isOpen() {
		return open;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public boolean isSafari() {
		return safari;
	}

}
