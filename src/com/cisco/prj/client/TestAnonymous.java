package com.cisco.prj.client;

@FunctionalInterface
interface Computation {
	int compute(int x, int y);
}
public class TestAnonymous {

	public static void main(String[] args) {
		Computation c1 = new Computation() {
			@Override
			public int compute(int x, int y) {
				return  x + y;
			}
		};
		
		System.out.println(c1.compute(4, 5));
		
		// Lambda expression > java 8
		
		Computation c2 = (int x, int y) -> {
			return  x - y;
		};
		
		System.out.println(c2.compute(6, 2));
		
		Computation c3 = (x,y) -> x * y;
		System.out.println(c3.compute(3, 4));
		
	}

}
