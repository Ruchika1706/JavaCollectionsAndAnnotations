package com.cisco.prj.client;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		map.put("Java", 2424.44);
		map.put("JS",634.44);
		map.put("Oracle", 3444.44);
		
		map.put("Java", 9999.22);
		
		map.forEach((k,v) -> {
			System.out.println(k + " : " + v);
		});
		
		System.out.println(map.get("JS"));
	}

}