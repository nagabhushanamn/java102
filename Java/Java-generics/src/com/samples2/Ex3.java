package com.samples2;

import java.util.Arrays;
import java.util.List;

public class Ex3 {

	public static double sumOfList1(List<? extends Number> list) {
		double s = 0.0;
		for (Number n : list)
			s += n.doubleValue();
		return s;
	}

	public static void addNumbers(List<? super Integer> list) {
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}

	public static void main(String[] args) {

		List<Integer> li1 = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList1(li1));

	}

}
