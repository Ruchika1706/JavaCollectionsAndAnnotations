package com.cisco.prj.client;

public class HashStory {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		/* Two different objects s1 and s2 but similar -> same content -> same hashcode*/
		String s3 = new String("Aa");
		String s4 = new String("BB");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
