package com.cisco.prj.client;

import com.cisco.prj.entity.Product;
import com.cisco.prj.util.Utility;

public class TestAnnotation {

	public static void main(String[] args) {
			String SQL = Utility.createSQL(Product.class);
			System.out.println(SQL);
	}

}
