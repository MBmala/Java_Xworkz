package com.xworkz.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapTester2 {
	public static void main(String[] args) {
		//Anonymous class-which dont have name 
		// if we don't want to use class for longer time use this class
		Comparator comparator=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);//des
				//return o2.compareTo(o1);//asce
			}
		};
/**
 * instead of writing Anonymous class for compare write lamda funtion 
 * Map<String, String> map = new TreeMap<String, String>((a, b) -> b.compareTo(a));//desc
 * Map<String, String> map = new TreeMap<String, String>((a, b) -> a.compareTo(b));//asce
 */
		
		Map<String, String> map = new TreeMap<String, String>(comparator);
		map.put("Jai ho", "Vijay Prakash");
		map.put("Kabira", "Arijith singh");
		map.put("Perfect", "Ed Shreeran");
		map.put("Happy Agide", "All Ok");
		map.put("Kali quarter bottle", "Vijay Prakash");

		Set<Entry<String, String>> entrySet = map.entrySet();
		entrySet.forEach(entry -> System.out.println( entry.getKey()+ " "+entry.getValue()));

		//map.forEach((k, v) -> System.out.println(k + " " + v));

		

		
	}


}
