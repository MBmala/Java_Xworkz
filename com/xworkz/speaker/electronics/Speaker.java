package com.xworkz.speaker.electronics;

public class Speaker {

	private int batteryBackupInhours;
	private String companyName = "JBL";
	private String color;

	// declare to control functionlaties
	private boolean connected;
	private int maxVolumeLevel = 4;
	private int minVolumeLevel = 0;
	private int currentVolume = 0;

	public Speaker(String color, int batteryBackupInhours) {
		this.color = color;
		this.batteryBackupInhours = batteryBackupInhours;
		System.out.println("Created Speaker");
		System.out.println("arg 1 " + color);
		System.out.println("arg 2 " + batteryBackupInhours);
	}

	public void onOrOff() {
		System.out.println("speaker is: ");
		if (this.connected == false) {
			this.connected = true;
			System.out.println("speaker is on");
//			return;
		} else if (this.connected == true) {
			this.connected = false;
			System.out.println("speaker is off");
		}

	}

	public void increaseVolume() {

		if(this.connected==true)
		{
			if (this.currentVolume < this.maxVolumeLevel) {
				this.currentVolume = this.currentVolume + 1;
				System.out.println("current volume is :" + this.currentVolume);
			} else {
				System.out.println("max volume reached");
			}	
		}
		else {
		System.out.println("gube speaker is off");
		}
		
		
	}
	
	public void decreaseVolume()
	{
		if(this.connected==true)
		{
			if (this.currentVolume > this. minVolumeLevel) {
				this.currentVolume = this.currentVolume-1;
				System.out.println("current volume is :" + this.currentVolume);
			} else {
				System.out.println("min volume reached");
			}	
		}
		else {
		System.out.println("gube speaker is off");
		}
		
	}

	public int getBatteryBackupInhours() {
		return batteryBackupInhours;
	}

	public String getColor() {
		return color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public boolean isConnected() {
		return connected;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

}
