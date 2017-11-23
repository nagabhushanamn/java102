package com.samples;

import java.util.ArrayList;

class A {
	public void abc() {
		System.out.println("abc..");
	}
}

class B extends A {

	@Override
	public void abc() {
	}
}

class Lib {

	@Deprecated
	void v1() {
		// ..
	}

	void v2() {
	}
}

public class Ex {

	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
		ArrayList arrayList = new ArrayList();

	}

}
