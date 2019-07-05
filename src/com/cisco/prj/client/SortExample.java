package com.cisco.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.cisco.prj.entity.Product;
import com.cisco.prj.util.Utility;

public class SortExample {

	public static void main(String[] args) {
		String[] names = {"Charles", "Lee", "Angelina", "George"};
		Product[] products = new Product[5];
		products[0] = new Product(24, "HP Spectra x360",13500.00, "computer");
		products[1] = new Product(24, "HP Spectra x360",14500.00, "computer");
		products[2] = new Product(24, "HP Spectra x360",15500.00, "computer");
		products[3] = new Product(24, "HP Spectra x360",12500.00, "computer");
		products[4] = new Product(24, "HP Spectra x360",11500.00, "computer");
		Utility.sort(names);
		for (String string : names) {
			System.out.println(string);
		}
		Arrays.sort(products, new Comparator<Product>() {
			public int compare(Product p1, Product p2) {
				return Double.compare(p1.getPrice(), p2.getPrice());
			}
		});
		Arrays.sort(products, (o1,o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
		for (Product product : products) {
			System.out.println(product);
//			System.out.println(product.getPrice());
		}

	}

}
