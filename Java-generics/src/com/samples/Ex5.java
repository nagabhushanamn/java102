package com.samples;

class Box1<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}

}

public class Ex5 {

	public static void main(String[] args) {

		Box1<Integer> integerBox = new Box1<Integer>();
		integerBox.set(new Integer(10));
		integerBox.inspect(20);

	}

}
