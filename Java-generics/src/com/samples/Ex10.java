package com.samples;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {

	static void foo(List<?> i) {
		// i.set(0, i.get(0));
		fooHelper(i);
	}

	private static <T> void fooHelper(List<T> l) {
		l.set(0, l.get(0));
	}

	public static void main(String[] args) {
		// List<Integer> integers=new ArrayList<>();
		// integers.set(0, 100);

		List<String> list1 = new ArrayList<>();
		list1.add("hello");
		foo(list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		foo(list2);

	}

}
