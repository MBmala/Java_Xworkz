package com.xworkz.example;

import java.util.Arrays;

import com.xworkz.example.dto.SweetDTO;
import com.xworkz.example.dto.SweetShapes;

public class SweetTester {

	public static void main(String[] args) {
		SweetDTO sweetDTO = new SweetDTO();
		System.out.println(sweetDTO.getName());
		System.out.println(sweetDTO.getPrice());

		System.out.println("********************************************");
		String[] color = { "white", "cream", "yellow" };
		SweetShapes shape = SweetShapes.valueOf("ROUND");
		SweetDTO sweetDTO1 = new SweetDTO("rasgulla", 100.0, "west bengal", color, shape, 250);
		System.out.println(sweetDTO1.getName());
		System.out.println(sweetDTO1.getPrice() + "Rs");
		System.out.println(sweetDTO1.getPopularState());
		String sweetColor = Arrays.toString(sweetDTO1.getColor());
		System.out.println(sweetColor);
		System.out.println(sweetDTO1.getShape());
		System.out.println(sweetDTO1.getQuantity() + "grams");

		System.out.println("********************************************");
		SweetDTO sweetDTO2 = new SweetDTO();
		sweetDTO2.setName("MysorePak");
		sweetDTO2.setPrice(700);
		sweetDTO2.setPopularState("Karnataka");
		String[] colour = { "light brown", "cream", "yellow" };
		sweetDTO2.setColor(colour);
		String form = "RECTANGLE";
		SweetShapes shape1 = SweetShapes.valueOf(form);
		sweetDTO2.setShape(shape1);
		sweetDTO2.setQuantity(1000);
		System.out.println(sweetDTO2.getName());
		System.out.println(sweetDTO2.getPrice() + "Rs");
		System.out.println(sweetDTO2.getPopularState());
		String banna = Arrays.toString(sweetDTO2.getColor());
		System.out.println(banna);
		System.out.println(sweetDTO2.getShape());
		System.out.println(sweetDTO2.getQuantity() + "grams");

	}

}
