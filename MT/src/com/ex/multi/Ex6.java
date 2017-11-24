package com.ex.multi;

public class Ex6 {

	private static class Counter {
		private int c;

		public synchronized void increment() {
			c = c + 1;
		}

		public synchronized void decrement() {
			c = c - 1;
		}

		public int getValue() {
			return c;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter(); // shared resource
		Runnable incRinnable = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		};
		Runnable decRunnable = () -> {
			for (int i = 0; i < 1000; i++) {
				counter.decrement();
			}
		};
		Thread[] incThreads = new Thread[1000];
		Thread[] decThreads = new Thread[1000];
		for (int i = 0; i < 1000; i++) {
			incThreads[i] = new Thread(incRinnable);
			decThreads[i] = new Thread(decRunnable);
			incThreads[i].start();
			decThreads[i].start();
		}
		for (int i = 0; i < 1000; i++) {
			incThreads[i].join();
			decThreads[i].join();
		}
		// ----------------------------------------------

		System.out.println(counter.getValue()); // 1000*1000 ==> 1000000

	}

}
