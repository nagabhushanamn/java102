package com;

import java.nio.Buffer;
import java.util.concurrent.TimeUnit;

public class Wait_Notify_Ex1 {

	private static int count = -1;
	private static int BUFFER_SIZE = 10;
	private static final int[] BUFFER = new int[BUFFER_SIZE];

	private static final Object LOCK = new Object();

	public static boolean isFull() {
		return count == (BUFFER_SIZE - 1);
	}

	public static boolean isEmpty() {
		return count >= -1;
	}

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	// ---------------------------------------------------------

	private static class Producer {
		public void produce() {
			synchronized (LOCK) {
				while (true) {
					if (isFull()) {
						printMessage("buffer-full, going to wait");
						try {
							LOCK.wait();
							TimeUnit.SECONDS.sleep(1);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					++count;
					BUFFER[count] = (int) (Math.random() * 100);
					printMessage("produced " + BUFFER[count] + "& notifying consumer");
					LOCK.notify();
				}
			}
		}
	}

	private static class Consumer {
		public void consume() {
			synchronized (LOCK) {
				while (true) {
					if (isEmpty()) {
						printMessage("buffer-empty, going to wait");
						try {
							LOCK.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					printMessage("consumed " + BUFFER[count] + " & notifying producer");
					BUFFER[count] = 0;
					count--;
					LOCK.notify();
				}
			}
		}
	}

	// ---------------------------------------------------------

	public static void main(String[] args) {

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable p = () -> {
			producer.produce();
		};
		Runnable c = () -> {
			consumer.consume();
		};
		// --------------------------------------------

		Thread pThread = new Thread(p, "producer");
		Thread cThread = new Thread(c, "consumer");

		// -------------------------------------------

		pThread.start();
		cThread.start();

	}

}
