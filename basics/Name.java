package com.xworkz.basics;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Mala";
        System.out.println("My name:"+name);
        
        String[] frds=args;
        System.out.println("My friends name:");
        for(int i=0;i<frds.length;i++) {
        System.out.println(frds[i]);

        }
	}

}
