package com.xworkz.string_methods;

public class StringTester {

	public static void main(String[] args) {
		// 2 ways of creating String object
		String color = "black";// literal
		String string = new String("smile");// using new

		String convetedString = color.toUpperCase();
		System.out.println("uppercase:" + convetedString);

		convetedString = color.toLowerCase();
		System.out.println("lowercase:" + convetedString);

		System.out.println("length:" + color.length());

		char c = color.charAt(2);
		System.out.println("character at index 2 in black:" + c);

		char[] charArray = color.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("character at index " + i + ":" + charArray[i]);
		}

		boolean value = color.isEmpty();
		System.out.println("is string empty:" + value);
		String colour = "";
		value = colour.isEmpty();
		System.out.println("is string empty:" + value);

		String concatinated = color.concat(" magic");
		System.out.println("concatinated steing:" + concatinated);
		concatinated = color + " friday";
		System.out.println("concatinated steing:" + concatinated);

		String part = color.substring(1);
		System.out.println("sub string:" + part);

		String biscuit = "   black" + " burbon  ";
		String cut = biscuit.trim();// removes leading & trailing space
		System.out.println(cut);

		int compare = color.compareTo("black");
		System.out.println(compare);

		boolean startChar = color.endsWith("b");
		System.out.println(startChar);

		boolean endChar = color.endsWith("k");
		System.out.println(endChar);

		
		colour = color.intern();
		System.out.println(colour);

		String replacedString = colour.replaceAll("b", "one");
		System.out.println(replacedString);

		String[] words = replacedString.split("l");
		for (String w : words) {
			System.out.println(w);
		}
		
		int num=90;
		String convertedNum=String.valueOf(num);//it converts any type into string
		System.out.println(convertedNum);
		
	}

}
