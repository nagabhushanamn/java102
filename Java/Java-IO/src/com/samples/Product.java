package com.samples;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 112345098765432L;
	
	private int id;
	private String name;
	private transient double price;
	private double discount;
	private Company company = new Company("Apple");

	public Product() {
		System.out.println("Product-constructor");
	}

	public Product(int id, String name, double price) {
		super();
		System.out.println("Product-constructor");
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

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

}
