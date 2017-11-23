package com.samples2;

import java.util.ArrayList;
import java.util.List;

class Util {

	void foo(List<?> i) {
		fooHelper(i);
	}

	private <T> void fooHelper(List<T> l) {
		l.set(0, l.get(0));
	}

}

public class Ex2 {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();
		integers.add(123);

		List<? extends Number> list = new ArrayList<Integer>();

	}

}
