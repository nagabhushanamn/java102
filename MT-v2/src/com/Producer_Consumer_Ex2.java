package com;

public class Producer_Consumer_Ex2 {

	private static Object lock = new Object();

	private static int[] buffer;
	private static int count;

	static class Producer {

		void produce() {
			synchronized (lock) {
				if (isFull(buffer)) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[count++] = 1;
				lock.notify();
			}
		}
	}

	static class Consumer {

		void consume() {
			synchronized (lock) {
				if (isEmpty(buffer)) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[--count] = 0;
				lock.notify();
			}
		}
	}

	static boolean isEmpty(int[] buffer) {
		return count == 0;
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	public static void main(String... strings) throws InterruptedException {

		buffer = new int[10];
		count = 0;

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable produceTask = () -> {
			for (int i = 0; i < 50; i++) {
				producer.produce();
				System.out.println("produced.." + i);
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Done producing");
		};
		Runnable consumeTask = () -> {
			for (int i = 0; i < 45; i++) {
				consumer.consume();
				System.out.println("consumed.." + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Done consuming");
		};

		Thread consumerThread = new Thread(consumeTask);
		Thread producerThread = new Thread(produceTask);

		producerThread.start();
		consumerThread.start();

		consumerThread.join();
		producerThread.join();

		System.out.println("Data in the buffer: " + count);
	}
}
