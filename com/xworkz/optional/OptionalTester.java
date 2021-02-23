package com.xworkz.optional;

import java.util.Optional;

public class OptionalTester {
	public static void main(String[] args) {

		String email = null;

		System.out.println(email);
		
		//to avoid nullPointerException
		if (email != null) {
			System.out.println(email.toUpperCase());
			
		}

		Optional<String> optional = Optional.of("sahana@xworkz.com");//it not takes null

		System.out.println(optional.isPresent());

		if (optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		System.out.println("-------------------------------------------");

		Optional<Integer> yearOptional = Optional.empty();

		System.out.println(yearOptional.isPresent());

		yearOptional.ifPresent((v) -> System.out.println(v));
		
		System.out.println("-------------------------------------------");

		Optional<String> country = Optional.ofNullable("india");//it takes null also

		country.ifPresent(e -> {
			String value = country.map(String::toUpperCase).get();//functional reference
			System.out.println(value);

		});
//Optional.ofNullable("null"); if it is null orElse() execute
		String def = country.orElse("Srilanka");
		System.out.println(def);
		
		
	}

}
