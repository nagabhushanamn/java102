package com.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product implements Comparable<Product> {

	private int id;
	private String name;
	private double price;
	private ProductType type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public Product(int id, String name, double price, ProductType type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	@Override
	public int compareTo(Product o) {
		if (this.price > o.price)
			return 1;
		if (this.price < o.price)
			return -1;
		return 0;
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Product product1 = new Product(423423, "Laptop", 2000.00, ProductType.ELEC);
		Product product2 = new Product(144423, "Mobile", 1000.00, ProductType.ELEC);
		Product product3 = new Product(542365, "Apple", 200.00, ProductType.OTHER);
		// -------------------------------------------------------------------
		List<Product> products = Arrays.asList(product1, product2, product3);
		// -------------------------------------------------------------------
		// Collections.sort(products);

		// class ProductsByName implements Comparator<Product> {
		// @Override
		// public int compare(Product o1, Product o2) {
		// return o1.getName().compareTo(o2.getName());
		// }
		// }
		//
		// Collections.sort(products, new ProductsByName());

		// --------------------------------------------------------------------

		// Collections.sort(products,new Comparator<Product>() {
		// @Override
		// public int compare(Product o1, Product o2) {
		// return o1.getName().compareTo(o2.getName());
		// }
		// });

		// --------------------------------------------------------------------

		// Lambda syntax

		/*
		 * 
		 * (param) -> { body }
		 * 
		 */

		Comparator<Product> nameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(products, nameComparator);

		display(products);
		

	}

	private static void display(List<Product> products) {
		for (Product product : products)
			System.out.println(product);
	}

}
