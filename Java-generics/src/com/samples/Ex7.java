package com.samples;

public class Ex7 {

	public static void someMethod(Number n) {
	}

	public static void boxTest(Box<Number> box) {

	}

	public static void main(String[] args) {

		// Object someObject = new Object();
		// Integer someInteger = new Integer(10);
		// someObject = someInteger;

		// someMethod(new Integer(10)); // OK
		// someMethod(new Double(10.1)); // OK

		// -------------------------------------
		//
		Box<Integer> box = new Box<Integer>();
		box.set(new Integer(10)); // OK

		// ---------------------------------------
		// boxTest(box); Error

	}

}
