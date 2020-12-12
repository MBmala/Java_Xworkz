package com.xworkz.example.dto;

public class MobileDTO {
	private String name;
	private String color;
	private int ram;
	private int memory;
	private int battery;
	private String os;
	private String camera;
	private float size;

	public MobileDTO() {

	}

	public MobileDTO(String name, String color, int ram, int memory, String camera) {
		this.name = name;
		this.color = color;
		this.ram = ram;
		this.memory = memory;
		this.memory = memory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

}
