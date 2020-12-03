package com.xworkz.constructor.constructor_exm;

public class Coffee {
	public int price;
	public String name="Nescafe";
public Coffee(int coffeePrice,String coffeeName)
{
	System.out.println("Invoked Coffee Constructor");
	System.out.println("default Price value :"+price);
	System.out.println("default name :"+name);
	price=coffeePrice;
	name=coffeeName;
	
}
public Coffee() //default constructor
{
	
}

}
