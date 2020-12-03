package com.xworkz.initialization.init;

public class Vehicle {

private String mfgDate;
private String company;
private String chassisNo;
private String color;
private String ownerName;

 public Vehicle(String mfgDate,String company,String chassisNo){
	 this.mfgDate=mfgDate;
	 this.company=company;
	 this.chassisNo=chassisNo; 
 }
//setter
public void setColor(String color) {
	this.color = color;
}

public void setOwnerName(String ownerName) {
	this.ownerName = ownerName;
}
//getter
public String getMfgDate() {
	return mfgDate;
}

public String getCompany() {
	return company;
}

public String getChassisNo() {
	return chassisNo;
}

public String getColor() {
	return color;
}

public String getOwnerName() {
	return ownerName;
}



}
