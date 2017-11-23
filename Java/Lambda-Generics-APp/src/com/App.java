package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lib.Lib;

class Book {
	String name;

	public Book(String name) {
		super();
		this.name = name;
	}

}

public class App {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("nag", "indu", "ria");
		Lib.forEach(names, i -> {
			System.out.println(i.toUpperCase());
		});

		System.out.println();

		List<Book> books = Arrays.asList(new Book("book-1"), new Book("book-2"));

		Lib.forEach(books, i -> {
			System.out.println(i.name.toUpperCase());
		});

		System.out.println();

		List<Double> priceList = Arrays.asList(12.12, 13.13, 14.14);
		List<Double> newPriceList = Lib.map(priceList, p -> p - 10.00);
		System.out.println(newPriceList);

		// --------------------------------

		// List[] myLists = new ArrayList[10];

	}

}
