package com.samples;

interface Adder {
	int add(int n1, int n2);
}

interface Joiner {
	String join(String n1, String n2);
}

class Util {

	public void testAdd(Adder adder) {
		int a = 12;
		int b = 13;
		int result = adder.add(a, b);
		System.out.println(result);
	}

	public void testJoin(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String result = joiner.join(s1, s2);
		System.out.println(result);
	}

}

public class Ex3 {

	public static void main(String[] args) {

		Util util = new Util();
		util.testAdd((a, b) -> a + b);
		util.testAdd((a, b) -> a + b + 100);
		util.testAdd((a, b) -> a + b + 200);

		util.testJoin((s1, s2) -> s1 + s2);
		util.testJoin((s1, s2) -> s1 + " " + s2);
		util.testJoin((s1, s2) -> s1 + " " + s2 + " !");

	}

}
