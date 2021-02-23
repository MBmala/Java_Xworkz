package com.xworkz.map;

import java.util.Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapTester {
	public static void main(String[] args) {

		
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();//ordered
		
		String name="Elon Musk";
		int age=49;
		
		map.put(name, age);
		map.put("Steve Jobs", 54);//new Entry<String,Integer>--->(key,value) 
		map.put("Kalam",83);
		map.put("LakshmiV",22);
		map.put("Yash",35);
		map.put("Pasha", 22);
		map.put("Skanda", 22);
		map.put("Skanda", 22);//it wont take duplicate key,but it takes duplicate values
		map.put(null, null);
		map.put("Rohan", null);
		System.out.println("size: "+map.size());
		
		
		//for key,values
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		System.out.println(entrySet.size());
		entrySet.forEach(r->{
			System.out.println(r.getKey()+" "+r.getValue());
		});
		
		
		
		
		
	}

}
