package com;

import com.app.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);

		for (Integer item : linkedList) {
			System.out.println(item);
		}

	}

}
