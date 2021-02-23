package com.xworkz.stream;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StreamTester1 {
	public static void main(String[] args) {

		// Ocean,Trainer,Flower, Park, Sweet....
		//IPLTeam 12, NuclearTest-2,ExtinxtAnimal-1, Chat-1,....
		//DanceForm 12, Perfume--1, NewsChannel--0 
		Set<String> sweetList = new HashSet<String>();
		sweetList.add("MysorePak");
		sweetList.add("KajuBarfi");
		sweetList.add("Rasgulla");
		sweetList.add("RasMalai");
		sweetList.add("Jilebi");
		sweetList.add("Kardantu");
		sweetList.add("Kunda");
		sweetList.add("Paisa");
		sweetList.add("Peda");
		sweetList.add("Huggi");

		// search for
		// stream
		// boolean value="".charAt(0)=='R';
		// Stream
		sweetList.stream().filter(s -> s.charAt(0) == 'R')
				.forEach(System.out::println);
		// method reference
		// String::toUpperCase

		sweetList.stream().filter(a -> a.length() == 5)
				.forEach(System.out::println);

		Optional<String> firstSweet = sweetList.stream()
				.filter(zzzzzz -> zzzzzz.length() >= 7).findAny();
		firstSweet.ifPresent(e -> System.out.println(e));
		System.out.println("zzzzzzzzzzzzzzzzzzzzz");
		// sorting
		sweetList.stream().sorted(Comparator.reverseOrder())
				.forEach(System.out::println);

	}

}
