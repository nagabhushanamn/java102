package com.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex2 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(5);

		Runnable r1 = () -> System.out.println("good mng");
		Runnable r2 = () -> System.out.println("good noon");

		service.execute(r1);
		service.execute(r2);

	}

}
