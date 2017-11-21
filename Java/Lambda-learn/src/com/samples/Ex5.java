package com.samples;

import java.util.function.*;

class Utils {
	public static Integer add1(Integer x) {
		return x + 1;
	}

	public static String concat1(String x) {
		return x + 1;
	}

	public static Function<Integer, Integer> makeAdder(Integer x) {
		return y -> x + y;
	}
}

public class Ex5 {

	public static void main(String[] args) {

		// 1. Functions with Lambda

		// Function<Integer, Integer> add=(Integer x)->{return x+1;};
		// Function<Integer, Integer> add=(x)->{return x+1;};
		// Function<Integer, Integer> add=x->{return x+1;};
		// Function<Integer, Integer> add=x->x+1;

		// System.out.println(add.apply(10));

		// ---------------------------------------------------

		// Function<String, String> concat = x -> x + 1;
		// System.out.println(concat.apply("hello"));

		// ---------------------------------------------------

		// Method Reference ==> when lambda body invoking any existing function only

		// Function<Integer, Integer> add=x->x+1;
		// Function<Integer, Integer> add1 = x -> {return Utils.add1(x);};
		// Function<Integer, Integer> add1 = Utils::add1;
		// System.out.println(add1.apply(10));

		// Function<String, String> concat = x -> x + 1;
		// Function<String, String> concat = x -> Utils.concat1(x);
		// Function<String, String> concat = Utils::concat1;

		// ---------------------------------------------------

		// 2. High Order Programming

		// a. function that create functions

		// Function<Integer, Function<Integer, Integer>> makeAdder = x -> y -> x + y;
		//
		// Function<Integer, Integer> add1 = makeAdder.apply(1);
		// Function<Integer, Integer> add10 = makeAdder.apply(10);
		// Function<Integer, Integer> add100 = makeAdder.apply(100);
		//
		// System.out.println(add1.apply(1));
		// System.out.println(add10.apply(1));
		// System.out.println(add100.apply(1));
		//
		// Function<Integer, Function<Integer, Integer>> makeAdder1 = Utils::makeAdder;
		// Function<Integer, Integer> add200 = makeAdder1.apply(200);

		// ---------------------------------------------------

		// b. Functions that Receive Functions as Arguments

		Function<Integer, Integer> add1 = x -> x + 1;
		Function<Integer, Integer> mul1 = x -> x * 3;
		Function<Integer, Integer> div1 = x -> x / 2;

		// Integer res = mul1.apply(add1.apply(10));
		// System.out.println(res);

		/*
		 * function composition
		 * 
		 * (f,g) -> x->g(f(x))
		 * 
		 * 
		 */

		// function composition : strategy -1

		// BinaryOperator<Integer> sum = (a, b) -> a + b;
		// System.out.println(sum.apply(12, 13));

		// BinaryOperator<Function<Integer, Integer>> compose1=null;
		// compose=(f,g) -> (x->g.apply(f.apply(x)));
		//
		// Function<Integer, Integer> h=compose1.apply(add1, div1);
		// System.out.println(h.apply(10));
		// System.out.println(h.apply(20));

		// function composition : strategy -2

		// Function<Integer, Integer> h = div1.compose(mul1.compose(add1));
		// System.out.println(h.apply(20));

		// ---------------------------------------------------

		// c. Partial-Functions or Currying

		/*
		 * sum 10 10 sum (10) (10)
		 * 
		 * 
		 */

		//
		// Function<Integer,Function<Integer, Integer>> sum=x->y->x+y;
		// Function<Integer, Integer> sum10=sum.apply(10);
		// System.out.println(sum10.apply(10));

		// -------------------------------------------------------------

		// d. unary functions
		//
		// UnaryOperator<Integer> sum=x->x+10;
		// System.out.println(sum.apply(10));

		// -------------------------------------------------------------

		IntFunction<Integer> func = x -> x + 10;
		System.out.println(func.apply(10));
		
		

	}

}
