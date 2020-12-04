package com.xworkz.speaker;

import com.xworkz.speaker.electronics.Speaker;

public class SpeakerTester {

	public static void main(String[] args) {

		Speaker speaker= new Speaker("RED", 6);
		System.out.println(speaker.getCompanyName());
		
		System.out.println(speaker.isConnected());
		
		speaker.increaseVolume();
		speaker.onOrOff();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		
		
		speaker.decreaseVolume();
		
		
		
		
	}

}
