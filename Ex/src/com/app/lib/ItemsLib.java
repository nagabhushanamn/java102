package com.app.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ItemsLib {

	public <T> void forEach(List<T> list, Consumer<T> action) {
		list.forEach(action);
	}

	public <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> list2 = new ArrayList<>();
		list.forEach(item -> {
			if (predicate.test(item))
				list2.add(item);
		});
		return list2;
	}

	public <T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> list2 = new ArrayList<>();
		list.forEach(item -> {
			list2.add(func.apply(item));
		});
		return list2;
	}

}
