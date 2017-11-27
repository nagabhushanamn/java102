package com.examples;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ex10 {

	public static void main(String[] args) {

		BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(5);

		Runnable write = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					blockingQueue.put(i);
					System.out.println("produced " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Runnable read = () -> {
			for (int i = 0; i < 10; i++) {
				Integer v = blockingQueue.poll();
				System.out.println("consimed " + v);
				try {
					TimeUnit.SECONDS.sleep(4);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(write);
		service.execute(read);

	}

}
