package com.xworkz.cosmetic.dto;

import com.xworkz.cosmetic.constants.CosmeticShades;
import com.xworkz.cosmetic.constants.CosmeticType;

public class CosmeticDTO {
	private String brand;
	private CosmeticShades cosmeticShades;
	private CosmeticType cosmeticType;
	private double price;
	private int quantity;

	public CosmeticDTO() {
		System.out.println("invoked CosmeticDTO ");
	}

	public CosmeticDTO(String brand, CosmeticShades cosmeticShades, CosmeticType cosmeticType, double price,
			int quantity) {
		super();
		this.brand = brand;
		this.cosmeticShades = cosmeticShades;
		this.cosmeticType = cosmeticType;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", cosmeticShades=" + cosmeticShades + ", cosmeticType=" + cosmeticType
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CosmeticDTO) {
				CosmeticDTO casted = (CosmeticDTO) obj;
				if (this.brand != null && this.cosmeticType != null) {
					if (casted.getBrand().equals(this.brand) && casted.getCosmeticType().equals(this.cosmeticType))//this condition is used to avoid duplicate adding
						return true;
				}
			}
		}

		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;

	}

	public CosmeticShades getCosmeticShades() {
		return cosmeticShades;
	}

	public void setCosmeticShades(CosmeticShades cosmeticShades) {
		this.cosmeticShades = cosmeticShades;
	}

	public CosmeticType getCosmeticType() {
		return cosmeticType;
	}

	public void setCosmeticType(CosmeticType cosmeticType) {
		this.cosmeticType = cosmeticType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
