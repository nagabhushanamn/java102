package com.samples2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// --
		List<Integer> l1 = new ArrayList<>();
		for (int n : numbers) {
			System.out.println("isEven-" + n);
			if (isEven(n))
				l1.add(n);
		}
		List<Integer> l2 = new ArrayList<>();
		for (int n : l1) {
			System.out.println("doubleIt-" + n);
			l2.add(doubleIt(n));
		}

		List<Integer> l3 = new ArrayList<>();
		for (int n : l2) {
			System.out.println("is > 5-" + n);
			if (isGreaterThan5(n)) {
				l3.add(n);
				break;
			}
		}
		System.out.println();
		System.out.println(l3.get(0));

		// ---

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
