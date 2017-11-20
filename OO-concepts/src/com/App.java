package com;

import com.app.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.add("biryani");
		linkedList.add("thali");

		for (String item : linkedList) {
			System.out.println(item);
		}

	}

}
