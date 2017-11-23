package com.samples;

class Box<T> {
	// T stands for "Type"
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

class Util {
	public static void addNumbers(Box<Number> box) {
	}

	public static void addStrings(Box<String> box) {
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Box<String> box = new Box<>();
		box.set("hello");

		// String item=box.get();

		Util.addNumbers(new Box<>());
		Util.addStrings(new Box<>());

	}

}
