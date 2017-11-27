package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex6 {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> buffer = new ArrayList<>();

		Lock lock = new ReentrantLock();
		Condition isEmpty = lock.newCondition();
		Condition isFull = lock.newCondition();

		class Consumer implements Callable<String> {

			public String call() throws InterruptedException, TimeoutException {

				int count = 0;
				while (count++ < 45) {
					try {
						lock.lock();
						while (isEmpty(buffer)) {
							// wait
							System.out.println("conumer awaiting..");
							isEmpty.await();
							System.out.println("conumer got signal..");
							// if (!isEmpty.await(10, TimeUnit.MILLISECONDS)) {
							// throw new TimeoutException("Consumer time out");
							// }
						}
						buffer.remove(buffer.size() - 1);
						// signal
						isFull.signal();
					} finally {
						lock.unlock();
					}
				}
				return "Consumed " + (count - 1);
			}
		}

		class Producer implements Callable<String> {

			public String call() throws InterruptedException {
				int count = 0;
				while (count++ < 50) {
					try {
						lock.lock();
						while (isFull(buffer)) {
							// wait
							System.out.println("producer await..");
							isFull.await();
							System.out.println("producer got signal..");
						}
						buffer.add(1);
						// signal
						isEmpty.signal();
					} finally {
						lock.unlock();
					}
				}
				return "Produced " + (count - 1);
			}
		}

		List<Producer> producers = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			producers.add(new Producer());
		}

		List<Consumer> consumers = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			consumers.add(new Consumer());
		}

		System.out.println("Producers and Consumers launched");

		List<Callable<String>> producersAndConsumers = new ArrayList<>();
		producersAndConsumers.addAll(producers);
		producersAndConsumers.addAll(consumers);

		ExecutorService executorService = Executors.newFixedThreadPool(8);
		try {
			List<Future<String>> futures = executorService.invokeAll(producersAndConsumers);

			futures.forEach(future -> {
				try {
					System.out.println(future.get());
				} catch (InterruptedException | ExecutionException e) {
					System.out.println("Exception: " + e.getMessage());
				}
			});

		} finally {
			executorService.shutdown();
			System.out.println("Executor service shut down");
		}

	}

	public static boolean isEmpty(List<Integer> buffer) {
		return buffer.size() == 0;
	}

	public static boolean isFull(List<Integer> buffer) {
		return buffer.size() == 10;
	}
}
