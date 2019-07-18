package com.training.process;

import java.util.HashMap;
import java.util.Map;

import com.training.iface.Command;

public class BookTour implements Command {

	@Override
	public Map<String, Object> execute(Map<String, String> map) {
		Map<String, Object> map2 = new HashMap<>();s
		String result = "#";
		String tourId = map.get("tourId");
		String userName = map.get("userName");
		String count = map.get("countValue");
		System.out.println(tourId+" "+userName+" "+count+";");
		return result;
	}

}
