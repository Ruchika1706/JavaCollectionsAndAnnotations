package com.cisco.prj.client;

import java.util.Set;
import java.util.TreeSet;

import com.cisco.prj.entity.Product;

public class SetExample {

	public static void main(String[] args) {
//		Set<Product> products = new HashSet<>();
		Set<Product> products = new TreeSet<>();
//		Set<Product> products = new TreeSet<>((p1,p2)->Double.compare(p1.getPrice(),p2.getPrice()));
		products.add(new Product(53, "iPhone", 89000.00, "mobile"));
		products.add(new Product(74, "Sony", 129000.00, "tv"));
		products.add(new Product(125, "Logitech Mouse", 622.00, "computer"));
		products.add(new Product(5, "OnePlus ", 56000.00, "mobile"));
		products.add(new Product(73, "LG", 69000.00, "tv"));
		products.add(new Product(125, "Logitech Mouse", 622.00, "computer"));
		for(Product p: products) {
			System.out.println(p);
		}
	}

}
