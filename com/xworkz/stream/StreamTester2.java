package com.xworkz.stream;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.stream.dto.IPLTeamDTO;
import com.xworkz.stream.dto.IPLTeamDTO.JerserColor;

public class StreamTester2 {
	public static void main(String[] args) {

		IPLTeamDTO iPlTeamDTO = new IPLTeamDTO("RCB", "Virat", JerserColor.RED,
				"Dr Mallya", "M Chinnaswamy Stadium", 5);

		IPLTeamDTO iPlTeamDTO1 = new IPLTeamDTO("CSK", "MS DHONI",
				JerserColor.YELLOW, "Kavya", "MA CHIDAMBARAM Stadium", 2);

		IPLTeamDTO iPlTeamDTO2 = new IPLTeamDTO("MI", "ROhit", JerserColor.BLUE,
				"Neeta Ambani", "Wakande", 3);

		IPLTeamDTO iPlTeamDTO3 = new IPLTeamDTO("SRH", "Warner",
				JerserColor.ORANGE, "Prathyusha", "Hyderbad", 2);

		List<IPLTeamDTO> list = new ArrayList<IPLTeamDTO>();
		list.add(iPlTeamDTO1);
		list.add(iPlTeamDTO3);
		list.add(iPlTeamDTO2);
		list.add(iPlTeamDTO);

		list.stream().filter(i -> i.getRating() > 2)
				.sorted((e1,e2)->Float.compare(e1.getRating(), e2.getRating()))
				.map(IPLTeamDTO::getName)
				.forEach(System.out::println);
/*		float totalRating=0;*/
		//List<IPlTeamDTO> lessList=list.stream().filter(r->r.getRating()<3)
/*		.collect(Collectors.toList());
		
		for (IPlTeamDTO e : lessList) {
			System.out.println(e.getName());
			totalRating=totalRating+e.getRating();
		}
		
		System.out.println(totalRating);
		*/		
		
		double totalRating=list.stream().filter(r->r.getRating()<3).
				mapToDouble(IPLTeamDTO::getRating).sum();
		System.out.println(totalRating);
	}

}
