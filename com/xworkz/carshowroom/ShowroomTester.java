package com.xworkz.carshowroom;

import com.xworkz.carshowroom.dto.ManagerDTO;
import com.xworkz.carshowroom.showroom.CarShowRoom;

public class ShowroomTester {

	public static void main(String[] args) {
		
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addManager("madhu",9875641230l);
		carShowRoom.displayManager();
		carShowRoom.updateManager(9845621730l);
		carShowRoom.removeManager();
		ManagerDTO dto=new ManagerDTO("mala",8975645123l);
		carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		carShowRoom.updateManager("omkar");
	}

}
