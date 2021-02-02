package com.xworkz.resort;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dao.ResortDAOImpl;
import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.ResortServiceImpl;

public class ResortTester {
	public static void main(String[] args) {
		List<ResortDTO> list = new LinkedList<ResortDTO>();

		ResortDAO dao = new ResortDAOImpl(list);

		ResortService resortService = new ResortServiceImpl(dao);

		ResortDTO dto = new ResortDTO("Ramanagara", "Shillandara", "Sharana", 15);

		resortService.validateAndSave(dto);

	}

}
