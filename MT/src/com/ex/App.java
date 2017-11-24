package com.ex;

import java.io.Console;
import java.io.IOException;

class Singleton {

	private static Singleton singleton = null;// Eager

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton(); // Lazy
		}
		return singleton;
	}
}

class Abc {
	double value;
}

public class App {

	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton1 == singleton2);

		// -------------------------------------------

		// Console console = System.console();

		// -----------------------------------------

		Runtime runtime = Runtime.getRuntime();

		System.out.println(runtime.totalMemory());
		System.out.println(runtime.freeMemory());

		for (int i = 0; i < 1000000000; i++) {
			Abc abc = new Abc();
			abc.value = i;
		}
		System.out.println(runtime.freeMemory());
		System.gc();
		System.out.println(runtime.freeMemory());

		// ------------------------------------------

		//
		// try {
		// runtime.exec("terminal");
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
