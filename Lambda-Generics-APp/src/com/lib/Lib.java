package com.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Lib {

	public static <E> void forEach(List<E> list, Consumer<E> consumer) {
		list.forEach(item -> consumer.accept(item));
	}

	public static <E> List<Double> map(List<E> list, UnaryOperator<E> mapper) {
		List<Double> outputList = new ArrayList<>();
		list.forEach(item -> {
			outputList.add((double)mapper.apply(item));
		});
		return outputList;
	}

}
