package com.xworkz.example;

import java.util.Arrays;

import com.xworkz.example.dto.PlayerDTO;

public class PlayerTester {
	public static void main(String[] args) {

		PlayerDTO playerDTO = new PlayerDTO();
		playerDTO.setName("MS Dhoni");
		System.out.println(playerDTO.getName());

		playerDTO.setCountry("India");
		System.out.println(playerDTO.getCountry());

		String[] sport = { "cricket", "football" };
		playerDTO.setSports(sport);
		String sports = Arrays.toString(playerDTO.getSports());
		System.out.println(sports);

		String awards[] = { "Padma Bhushan", "padma shri" };
		playerDTO.setAwards(awards);
		// System.out.println(playerDTO.getAwards());
		String awardNames = Arrays.toString(playerDTO.getAwards());
		System.out.println(awardNames);

	}

}
