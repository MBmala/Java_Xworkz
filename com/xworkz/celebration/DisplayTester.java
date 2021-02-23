package com.xworkz.celebration;

import com.xworkz.celebration.service.DisplayService;
import com.xworkz.celebration.service.DisplayServiceImpl;

public class DisplayTester {

	
	public static void main(String[] args) {
DisplayService service=new DisplayServiceImpl();
		//lamda function
        service.printString(l ->{
        	//for one parameter
        	if(l.contains("a") || l.contains("A")) {
        		System.out.println(l);
        	}
        	
        });
		/*service.printString((l,t)->{
		 * //for two parameter
			System.out.println("validating"+l + " t"+t);
			if(l.contains("a") || l.contains("A"))
			{
				System.out.println(l+ " "+l.hashCode());
			}
		});*/
		
		
	}

	}


