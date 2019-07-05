package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.cisco.prj.entity.Product;

public class ListExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(53, "iPhone", 89000.00, "mobile"));
		products.add(new Product(74, "Sony", 129000.00, "tv"));
		products.add(new Product(125, "Logitech Mouse", 622.00, "computer"));
		products.add(new Product(5, "OnePlus ", 56000.00, "mobile"));
		products.add(new Product(73, "LG", 69000.00, "tv"));
		Collections.sort(products,(p1,p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		for(Product p: products) {
			System.out.println(p);
		}
		System.out.println("******");
		products.stream()
			.filter(p->p.getCategory().equals("tv"))
			.forEach(p->System.out.println(p));
		System.out.println("******");
		products.stream()
			.filter(p->p.getCategory().equals("tv"))
			.map(p->p.getName())
			.forEach(p->System.out.println(p));
		System.out.println("******");
		double total = products.stream()
			.map(p->p.getPrice())
			.reduce(0.0,(v1,v2)->v1 + v2);
		System.out.println(total);
		System.out.println("******");
		List<Product> tvs = products.stream()
				            .filter(p->p.getCategory().contentEquals("tv"))
				            .collect(Collectors.toList());
		for (Product product : tvs) {
			System.out.println(product.getName());
		}
	}
	

}
