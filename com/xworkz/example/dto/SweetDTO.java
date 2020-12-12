package com.xworkz.example.dto;

public class SweetDTO {
	private String name;
	private double price;
	private String popularState;
	private String color[];
	private SweetShapes shape;// enum
	private int quantity;

	public SweetDTO() {

	}

	public SweetDTO(String name, double price, String popularState, String color[], SweetShapes shape, int quantity) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.popularState = popularState;
		this.shape = shape;
		this.quantity = quantity;

	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPopularState() {
		return popularState;
	}

	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}

	public String[] getColor() {
		return color;
	}

	public void setColor(String[] color) {
		this.color = color;
	}

	public SweetShapes getShape() {
		return shape;
	}

	public void setShape(SweetShapes shape) {
		this.shape = shape;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
