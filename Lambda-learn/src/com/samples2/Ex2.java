package com.samples2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		// Lambda Syntax
				
		//		Optional<Integer> optional=numbers
		//		.stream()
		//		.filter(n->n%2==0)
		//		.map(n->n*n)
		//		.filter(n->n > 5)
		//		.findFirst();
				
		
		// Method Reference Syntax
		
		Optional<Integer> optional=numbers
				.stream()
				.filter(Ex2::isEven)
				.map(Ex2::doubleIt)
				.filter(Ex2::isGreaterThan5)
				.findFirst();
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
	}
	
	private static boolean isGreaterThan5(int n) {
		return n > 5;
	}

	private static int doubleIt(int n) {
		return n * 2;
	}

	private static boolean isEven(int n) {
		return n % 2 == 0;
	}

}
