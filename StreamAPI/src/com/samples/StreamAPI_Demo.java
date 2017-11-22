package com.samples;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI_Demo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Stream<Integer> stream = list.parallelStream();

		Integer sum = stream.filter((n) -> {
			return n % 2 == 0;
		}).map((n) -> {
			return n * n;
		}).reduce(0, Integer::sum);

		System.out.println(sum);

		// -----------------------------------------------------------------

		System.out.println("Enetr Num");
		Scanner scanner = new Scanner(System.in);
		int userNum = scanner.nextInt();

		Predicate<Integer> predicate = (i) -> i % 2 == 0;

		if (predicate.test(userNum)) {
			System.out.println("Even");
		} else {
			System.out.println("False");
		}

	}

}
