package com.samples2;

import java.util.function.Consumer;
import java.util.function.Function;

/*
 *  closure
 *  ---------
 * 
 */

public class Ex7 {

	public static void main(String[] args) {

		Consumer<String> doLearn = doTraining();
		doLearn.accept(" im leaning with ");
		doLearn.accept(" im leaning with ");
		doLearn.accept(" im leaning with ");
		doLearn.accept(" im leaning with ");

		Function<Integer, Function<Integer, Integer>> makeAdder = x -> y -> x + y;
		Function<Integer, Integer> add10 = makeAdder.apply(10);
		System.out.println(add10.apply(100));

	}

	public static Consumer<String> doTraining() {
		String name = "Java Notes..";
		return s -> System.out.println(s + "->" + name);
	}

}
