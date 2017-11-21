package com.samples;

interface Condition<T> {
	boolean value(T t);
}

class Util {
	public static <T> T find(T[] array, Condition<? super T> condition) {
		for (T element : array) {
			if (condition.value(element))
				return element;
		}
		return null;
	}
}

public class Ex1 {

	public static void main(String[] args) {
		String[] array = { "Nag", "Indu", "Ria" };
		
		//		String out = Util.find(array, new Condition<String>() {
		//			@Override
		//			public boolean value(String t) {
		//				return t.startsWith("N");
		//			}
		//		});
		
		// or
		
		String out=Util.find(array, t->t.startsWith("N"));
		System.out.println(out);
	}

}
