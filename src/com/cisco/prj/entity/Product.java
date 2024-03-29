package com.cisco.prj.entity;

import com.cisco.prj.annotation.Column;
import com.cisco.prj.annotation.Table;

@Table(name="products")
public class Product implements Comparable<Product>{
	private int id;
	private String name;
	private double price;
	private String category;
	
	@Override
	public int compareTo(Product o) {
//		if(this.price > o.price) {
//			return 1;
//		} else if(this.price < o.price) {
//			return -1;
//		} else {
//			return 0;
//		}
		// if price is integer, return (this.price - price), but double here
		//loss of precision if we do typecast. 
		//As comparison should be based on Primary Key only
		return id - o.id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	public Product() {
		super();
	}

	public Product(int id, String name, double price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	@Column(name="pid", type="numeric(10)")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
 
	@Column(name="product_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
