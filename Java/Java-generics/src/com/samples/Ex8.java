package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class LivinThing {
	void eat() {
		System.out.println("LT-eat");
	}

	void sleep() {
		System.out.println("LT-sleep");
	}

	abstract void work();
}

class Human extends LivinThing {
	@Override
	void work() {
		System.out.println("Human work..");
	}
}

class Animal extends LivinThing {
	@Override
	void work() {
		System.out.println("Anumal-work");
	}
}

class God {
	public void manageLT(List<? extends LivinThing> livinThings) {
		for (LivinThing livinThing : livinThings) {
			livinThing.eat();
			livinThing.sleep();
			livinThing.work();
		}
	}
}

public class Ex8 {

	// Upper Bounded Wildcards
	public static double sumOfList(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	// Unbounded Wildcards
	public static void printList(List<?> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}
	// Lower Bounded Wildcards

	/*
	 * Integer <-- Number <--- Object
	 * 
	 */
	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}

	public static void main(String[] args) {

		// List<Integer> li = Arrays.asList(1, 2, 3);
		// System.out.println("sum = " + sumOfList(li));
		//
		// List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		// System.out.println("sum = " + sumOfList(ld));

		// List<Integer> li = Arrays.asList(1, 2, 3);
		// List<String> ls = Arrays.asList("one", "two", "three");
		// printList(li);
		// printList(ls);

		// List<Integer> integers=new ArrayList<>();
		// List<String> integers = new ArrayList<>();
		// System.out.println(integers);
		
		//---------------------------------------

	}

}
