package com.xworkz.sports.award;

public class Ceremony {

	private String name;
	private String[] foods;

	public Ceremony() {
		System.out.println("Created Ceremony");
	}

	public Ceremony(String name) {
		this.name = name;
	}

	public void distributeAward(String personName, String award) {
		System.out.println("invoked distributeAward");
		System.out.println("Name :" + personName);
		System.out.println("award :" + award);
	}

	public void displayFoods() {
		System.out.println("invoked displayFoods");
		//System.out.println(this.foods);
		if (this.foods != null) {
			for (int z = 0; z < this.foods.length; z++) {
				String food = this.foods[z];
				System.out.println(food);
			}
		}
	}

	public void displayCeremoryNameAndFoods() {
		System.out.println(this.name);
		this.displayFoods();// calling instance method
	}

	public void accessParentMembers() {
		// ie Object class
		int hCode = super.hashCode();
		System.out.println(hCode);
		String string = super.toString();
		System.out.println(string);

	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}

}
