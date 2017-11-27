package com.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex1 {

	public static void main(String[] args) {

		Runnable task = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " -> start-task");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " -> end-task");
		};

		// for (int i = 0; i < 10; i++) {
		// new Thread(task).start();
		// }

		// ExecutorService service = Executors.newSingleThreadExecutor();
		// ExecutorService service = Executors.newFixedThreadPool(4);
		ExecutorService service = Executors.newCachedThreadPool();
		// service.execute(task);
		for (int i = 0; i < 10; i++) {
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			service.execute(task);
		}

		service.shutdown();

	}

}
