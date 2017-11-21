package com.samples2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex4 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 1);
		
		Optional<Integer> optional=numbers
		.stream()
		.filter(n->n%2==0)
		.limit(3)
		.reduce(Integer::sum);

		System.out.println(optional.orElse(0));

	}

}
