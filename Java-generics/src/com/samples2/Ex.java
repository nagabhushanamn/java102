package com.samples2;

import java.util.ArrayList;
import java.util.List;


class Box {

	public void add(List<? super Integer> list) {
		System.out.println(list);
	}

}

public class Ex {
	public static void main(String[] args) {

		Box box = new Box();

		// List<Number> list1 = new ArrayList<Number>();
		// List<Number> list2 = new ArrayList<>(); // type inference
		//
		// Number number = new Integer(123);

		// Field Level

		// a. UpperBounded Type:
		// List<Number> list3 = new ArrayList<Integer>(); Compile Error
		// List<? extends Number> list4 = new ArrayList<Integer>();
		// Box<? extends Number> box = new Box<Integer>();

		// b. Unbounded Type
		// List<?> list = new ArrayList<Integer>();
		// System.out.println(list.get(0));

		// c. LowerBounded Type
		// List<? super Integer> list5=new ArrayList<Integer>();
		// List<? super Integer> list5 = new ArrayList<Number>();
		// List<? super Integer> list5 = new ArrayList<Object>();

	}
}
