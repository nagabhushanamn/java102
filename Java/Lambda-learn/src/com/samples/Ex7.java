package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex7 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Imperative style

		for (int number : numbers) {
			if (number % 2 == 0) {
				int n2 = number * 2;
				if (n2 > 5) {
					System.out.println(n2);
					break;
				}
			}
		}
		
		//----------------------------------------------------------------------------

		// Naive approach with imperative-style
		
		
		//		List<Integer> l1 = new ArrayList<>();
		//		for (int n : numbers) {
		//			if (isEven(n))
		//				l1.add(n);
		//		}
		//		List<Integer> l2 = new ArrayList<>();
		//		for (int n : l1) {
		//			l2.add(doubleIt(n));
		//		}
		//
		//		List<Integer> l3 = new ArrayList<>();
		//		for (int n : l2) {
		//			if (isGreaterThan5(n)) {
		//				l3.add(n);
		//				break;
		//			}
		//		}
		//
		//		System.out.println(l3.get(0));
		
		
		//----------------------------------------------------------------------------
		
		// Functional Style
		
		Optional<Integer> optional=
		numbers
		.stream()
		.filter(n->n%2==0)
		.map(n->n*n)
		.filter(n->n>5)
		.findFirst();
		
		System.out.println(optional.get());
		

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
