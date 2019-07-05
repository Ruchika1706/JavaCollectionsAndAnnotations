package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class HOF {
	
	public static List<Integer> filter(List<Integer> data, Predicate<Integer> predicate) {
		List<Integer> col = new ArrayList<>();
			for(int x : data) {
				if(predicate.test(x)) {
					col.add(x);
				}
			}
		
		return col;
	}
	
	public static void main(String[] args) {
		List<Integer> elems = Arrays.asList(5,23,7,8,221,73,72,90);
		
		List<Integer> list = filter(elems, (no) -> no %2 == 0);
		System.out.println(list);
	}

}