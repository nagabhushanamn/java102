package com.samples2;

import java.util.Arrays;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 1);

		Integer i=numbers.stream()
		.reduce((a, b) -> a > b ? a : b)
		.get();
		
		System.out.println(i);
		

	}

}
