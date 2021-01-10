package com.xworkz.clone.dto;

public class PalaceDTO implements Cloneable {
	private String location;
	private String kingName;
	private String queenName;

	public PalaceDTO() {
		System.out.println("invoked PalaceDTO");
	}

	@Override
	public int hashCode() {
		System.out.println("invoked hashCode");
		return 20;
	}

	@Override
	public String toString() {
		return "PalaceDTO [location=" + location + ", kingName=" + kingName + ", queenName=" + queenName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj == this) {
				System.out.println("obj pointing to same memory");
				return true;
			}
			if (obj instanceof PalaceDTO) {
				PalaceDTO casted = (PalaceDTO) obj;
				if (casted.getLocation() != null && casted.getLocation().equals(this.location))
					System.out.println("location is same");
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("invoked clone");
		return super.clone();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getKingName() {
		return kingName;
	}

	public void setKingName(String kingName) {
		this.kingName = kingName;
	}

	public String getQueenName() {
		return queenName;
	}

	public void setQueenName(String queenName) {
		this.queenName = queenName;
	}

}
