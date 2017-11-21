package com.samples;

import java.util.function.*;

// Functional Programming with Java 8 Functions

class Utils {
	public static Integer add1(Integer x) {
		return x + 1;
	}

	public static String concat1(String x) {
		return x + 1;
	}

	public static Function<Integer, Integer> adder(Integer x) {
		return y -> x + y;
	}
}

public class Ex3 {

	public static void main(String[] args) {

		// -----------------------------------------------------------------

		// 1. Functions with Lambda

		Function<Integer, Integer> add = x -> x + 1;
		Function<String, String> concat = x -> x + 1;

		// or

		// Function<Integer, Integer> add1 = Utils::add1;
		// Function<String, String> concat1 = Utils::concat1;

		Integer two = add.apply(1); // yields 2
		String answer = concat.apply("0 + 1 = "); // yields "0 + 1 = 1"

		// -----------------------------------------------------------------

		// 2. High Order Programming

		// a. Functions that Create Functions

		// Function<Integer, Function<Integer, Integer>> makeAdder = x -> y -> x + y;
		//
		// Function<Integer, Integer> add1 = makeAdder.apply(1);
		// Function<Integer, Integer> add2 = makeAdder.apply(2);
		// Function<Integer, Integer> add3 = makeAdder.apply(3);
		//
		// Function<Integer, Function<Integer, Integer>> makeAdder1 = Utils::adder;
		// Function<Integer, Integer> addOne = makeAdder.apply(1);

		// ---------------------------------------------------------

		// b. Functions that Receive Functions as Arguments
		//
		Function<Integer, Integer> add1 = x -> x + 1;
		Function<Integer, Integer> mul3 = x -> x * 3;
		//
		// Integer x = 10;
		// Integer res = mul3.apply(add1.apply(x)); // yields 33

		// ---------------------------------------------------------

		// (f,g) -> x -> g( f(x) ) /// Function composition

		// ---------------------------------------------------------

		// Function Composition Strategy 1

		// BinaryOperator<Integer> sum = (a,b) -> a + b;
		// Integer res = sum.apply(1,2); // yields 3

		// BinaryOperator<Function<Integer, Integer>> compose = (f, g) -> x ->
		// g.apply(f.apply(x));
		//
		// Function<Integer, Integer> h = compose.apply(add1, mul3);
		// Integer res = h.apply(10); // yields 33

		// ---------------------------------------------------------

		// Function Composition Strategy 2 ( easy )

		// Function<Integer, Integer> h = mul3.compose(add1);
		// Integer res = h.apply(10);

		// ---------------------------------------------------------

		// c. Partial Function Application or Currying
		
		/*
		 * 
		 *  sum = x -> y -> x + y
		 *  
		 *  sum 10 5 //yields 15
		 *  
		 *  sum(10)(5) //yields 15
		 *  
		 *  plus10 = sum 10
		 *  
		 *  plus10(5) //yields 15
		 * 
		 */
		
		
		Function<Integer, Function<Integer, Integer>> sum = x -> y -> x + y;
		
		Function<Integer, Integer> plus10 = sum.apply(10);
		Integer res = plus10.apply(5); //yields 15
		
		// ---------------------------------------------------------
		
		
//		Unary Functions
		
//		
//		Function<String,Integer> atoi = s -> Integer.valueOf(s);
//		
//		UnaryOperator<Integer> add1 = n -> n + 1;
//		UnaryOperator<String> concat1 = s -> s + 1;
//		Function<Integer, UnaryOperator<Integer>> sum = x -> y -> x + y;
//		UnaryOperator<Integer> sum10 = sum.apply(10);
		
		// ---------------------------------------------------------
		
//		Value Types and Primitive Type Functions?
		
		IntFx add11 = n -> n + 1;
		
//		IntFunction<IntFx> sum = x -> y -> x + y;
//		IntFx sum10 = sum.apply(10);
//		sum10.apply(4); //yields 14
		
		//--------------------------------------------------------
		

	}

}


interface IntFx {
    public int apply(int value);
}