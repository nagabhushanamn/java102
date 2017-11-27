package com.ex.multi;

import java.util.concurrent.TimeUnit;

public class Ex10 {

	public static void printMessage(String message) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " -> " + message);
	}

	private static class StaticCounter {

		private static int totalCount;

		// public static int getTotal() {
		// return totalCount;
		// }

		public synchronized static void incTotalCount() throws InterruptedException {
			// synchronized (StaticCounter.class) {
			printMessage("started inc..");
			TimeUnit.SECONDS.sleep(2);
			totalCount++;
			printMessage("finsished inc..");
			// }
		}

		public synchronized static void decTotalCount() throws InterruptedException {
			// synchronized (StaticCounter.class) {
			printMessage("started dec..");
			TimeUnit.SECONDS.sleep(2);
			totalCount--;
			printMessage("finsished dec..");
			// }
		}

	}

	public static void main(String[] args) {

		Runnable inc = () -> {
			try {
				StaticCounter.incTotalCount();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable dec = () -> {
			try {
				StaticCounter.decTotalCount();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		// -------------------------------------

		Thread thread1 = new Thread(inc, "boy-1");
		Thread thread2 = new Thread(inc, "boy-2");
		Thread thread3 = new Thread(dec, "girl-1");
		Thread thread4 = new Thread(dec, "girl-2");

		// -----------------------------------------

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		// -------------------------------------------s

	}

}
