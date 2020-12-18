package com.xworkz.carshowroom;

import com.xworkz.carshowroom.dto.CarDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;
import com.xworkz.carshowroom.constants.CarVariant;

public class CarTester {

	public static void main(String[] args) {
		CarShowRoom carShowRoom=new CarShowRoom();
        CarDTO dto=new CarDTO("swift",800000,CarVariant.BASE);
       // carShowRoom.displayCar();
        carShowRoom.addCar(dto);
        carShowRoom.displayCars();
        carShowRoom.updateCarVariant(CarVariant.MID,0);
        carShowRoom.displayCarAtIndex(0);
        
         dto=new CarDTO("Tesla",2000000,CarVariant.TOP);
        carShowRoom.addCar(dto);
        carShowRoom.displayCars();
        carShowRoom.displayCarAtIndex(1);
        
        		
	}
}