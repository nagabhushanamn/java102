package com.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Ex3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

		Callable<String> task = () -> {
			// TimeUnit.MILLISECONDS.sleep(300);
			// return "im in thread " + Thread.currentThread().getName();
			throw new IllegalStateException("illegal state");
		};

		ExecutorService service = Executors.newFixedThreadPool(4);

		try {
			for (int i = 0; i < 10; i++) {
				Future<String> future = service.submit(task);
				System.out.println("i Get " + future.get(100, TimeUnit.MILLISECONDS));
			}
		} catch (ExecutionException e) {
			System.out.println(e.getMessage());
		}

	}

}
