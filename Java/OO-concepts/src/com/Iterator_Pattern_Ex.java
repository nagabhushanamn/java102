package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class VegBox implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {

		class BoxIterator implements Iterator<String> {

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public String next() {
				return null;
			}

		}
		BoxIterator iterator = new BoxIterator();
		return iterator;

	}
	// ..
}

class NonVegBox implements Iterable<String> {

	@Override
	public Iterator<String> iterator() {

		class BoxIterator implements Iterator<String> {

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public String next() {
				return null;
			}

		}
		BoxIterator iterator = new BoxIterator();
		return iterator;

	}
	// ..
}

public class Iterator_Pattern_Ex {

	public static void main(String[] args) {

		ArrayList<String> southMenu = new ArrayList<>();
		southMenu.add("idly");
		southMenu.add("vada");
		southMenu.add("poori");

		for (String item : southMenu) {
			System.out.println(item);
		}

		// -------------------------------------------

		LinkedList<String> northMenu = new LinkedList<>();
		northMenu.add("roti");
		northMenu.add("paneer");

		for (String item : northMenu) {
			System.out.println(item);
		}

		// --------------------------------------------

		NonVegBox nonVegBox = new NonVegBox();
		// for (String item : nonVegBox) {
		// System.out.println(item);
		// }

		// or

		Iterator<String> iterator = nonVegBox.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// --------------------------------------------

	}

}
