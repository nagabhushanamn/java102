package com.samples2;

import java.util.function.Consumer;

public class Ex6 {

	public static void main(String[] args) {

		final String compName = "Sapient";
		// compName = "some other company..";

		String hello = "Hello";

		Consumer<String> consumer = s -> {
			System.out.println(s + " - " + compName);
		};

		consumer.accept(hello);

	}

}
