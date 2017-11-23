package com.samples;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {

	public static void main(String[] args) {

		class A {
		}
		class B extends A {
		}

		B b = new B();
		A a = b;

		// List<B> lb = new ArrayList<>();
		// List<A> la = lb; // Error

		List<? extends Integer> intList = new ArrayList<>();
		List<? extends Number> numList = intList;

		// List<Integer>[] array = new List<Integer>[10]; // does not compile

	}

}
