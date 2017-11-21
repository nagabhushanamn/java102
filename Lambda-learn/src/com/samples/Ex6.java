package com.samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// why do we need functional-programming in java ?

public class Ex6 {

	public static void main(String[] args) {

		// List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// 1. External vs. Internal iteration
		// -------------------------------------

		// for (int number : numbers) {
		// System.out.println(number);
		// }

		// ----------------------------------------

		// numbers.forEach(new Consumer<Integer>() {
		// @Override
		// public void accept(Integer t) {
		// System.out.println(t);
		// }
		// });

		// ----------------------------------------

		// numbers.forEach((Integer n)->{System.out.println(n);});
		// numbers.forEach((n)->{System.out.println(n);});
		// numbers.forEach(n->{System.out.println(n);});
		// numbers.forEach((n)->System.out.println(n));
		// numbers.forEach(System.out::println);

		// ---------------------------------------------------

		// 2. passing behav , not only values

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// int total = sumAll(numbers);
		// int total = sumAllEven(numbers);
		// System.out.println(total);

		// int total = sumAll(numbers, n -> true);
		// int total = sumAll(numbers, n -> n % 2 == 0);
		int total = sumAll(numbers, n -> n > 3);
		System.out.println(total);
		
		

	}

	// public static int sumAll(List<Integer> numbers) {
	// int total = 0;
	// for (int n : numbers) {
	// total += n;
	// }
	// return total;
	// }
	//
	// public static int sumAllEven(List<Integer> numbers) {
	// int total = 0;
	// for (int n : numbers) {
	// if (n % 2 == 0)
	// total += n;
	// }
	// return total;
	// }

	// ....

	
	public static int sumAll(List<Integer> numbers, Predicate<Integer> predicate) {
		int total = 0;
		for (int n : numbers) {
			if (predicate.test(n))
				total += n;
		}
		return total;
	}

}
