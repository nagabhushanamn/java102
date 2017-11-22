package com.samples;

import java.util.Arrays;
import java.util.List;

class Util1 {

	public <T> void printItems(List<T> list) {

	}

	
	public <E> E reflect(E e) {
		return e;
	}

	public <A, B> B m(A a, B b) {
		return b;
	}

}

public class Ex4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("hello", "hey");
		Util1 util = new Util1();
		util.printItems(list);

		System.out.println(util.reflect("hello"));
		System.out.println(util.reflect(123));

		System.out.println(util.m("hello", 123));
		System.out.println(util.m(123, "hello"));
	}

}
