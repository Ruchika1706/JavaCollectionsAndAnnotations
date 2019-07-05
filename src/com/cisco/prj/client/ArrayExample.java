package com.cisco.prj.client;

import java.util.Arrays;
import java.util.Comparator;

class Dummy implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
}

public class ArrayExample {

	public static void main(String[] args) {
		String[] names = { "Charles", "Lee", "Brad", "Angelina", "George" };
		Arrays.sort(names, new Dummy());
//		Arrays.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.length() - o2.length();
//			}
//		});
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}
