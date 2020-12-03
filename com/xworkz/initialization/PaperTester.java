package com.xworkz.initialization;

import com.xworkz.initialization.init.Paper;

public class PaperTester {
	public static void main(String[] args) {
		Paper paper=new Paper("ClassMate",29.7f,21.0f,"white");
		
		String brand=paper.getBrand();
		float height=paper.getHeight();
		float width=paper.getWidth();
		String color=paper.getColor();
		
		System.out.println("paper brand :"+brand);
		System.out.println("Height :"+height);
		System.out.println("Width :"+width);
		System.out.println("Color :"+color);
		
		paper.color="light yellow";
		color=paper.getColor();
		System.out.println("changed color :"+color);
		
		Paper paper1=new Paper();
		float height1=paper1.getHeight();
		float width1=paper1.getWidth();
		System.out.println(" updated Height :"+ height1);
		System.out.println("updated Width :" +width1);
	}

}
