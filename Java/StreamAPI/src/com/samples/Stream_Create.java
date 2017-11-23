package com.samples;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Stream_Create {

	public static void main(String[] args) throws IOException {

		Stream<String> stream = Stream.of("a", "b", "c");

		List<String> newList = 
				stream.map(s-> s.toUpperCase())
				      .collect(Collectors.toList());

		newList.forEach(System.out::println);

		// -----------------------------------------------

		int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.map((n) -> n * n)
				.reduce(0, Integer::sum);

		System.out.println(sum);

		// ----------------------------------------------------

		String[] array = { "A", "B", "C" };

		Stream<String> arrayStream = Stream.of(array);

		// -------------------------------------------------------

		String menu = "idly,wada,poori";

		Stream<String> menuStream = Stream.of(menu.split(","));

		// ------------------------------------------------------------

		int[] nArray = { 1, 2, 3, 4, 5, 6 };
		IntStream intStream = IntStream.of(nArray);
		LongStream longStream;
		DoubleStream doubleStream;

		// ----------------------------------------------------------------

		Stream<String> emptyStream = Stream.empty();

		// -------------------------------------------------------------------

		// Stream - iterate

		Stream.iterate(1L, n -> n + 1).limit(10).forEach(System.out::println);

		Stream.generate(Math::random).limit(10).forEach(System.out::println);

		// ---------------------------------------------------------------

		Path path=Paths.get("/"); // dir
		Stream<String> fileStream=Files.lines(path);
		
		//-------------------------------------------------------------------
		
		
	}

}
