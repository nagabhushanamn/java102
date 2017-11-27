package com.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class Ex7 {

	public static void main(String[] args) throws InterruptedException {

		Map<Integer, Integer> map = new HashMap<>();

		ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		ReadLock readLock = readWriteLock.readLock();
		WriteLock writeLock = readWriteLock.writeLock();

		Runnable writeWork = () -> {
			try {
				writeLock.lock();
				System.out.println("write start..");
				for (int i = 0; i < 10; i++) {
					map.put(i, i * i);
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("write step " + i + 1);
				}
				System.out.println("write end..");
			} finally {
				writeLock.unlock();
			}
		};

		// -------------------------------------------

		Runnable readWork = () -> {
			try {
				readLock.lock();
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "->" + map.get(i));
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} finally {
				readLock.unlock();
			}
		};

		// -----------------------------------------------
		ExecutorService service = Executors.newFixedThreadPool(4);
		service.execute(writeWork);
		Thread.sleep(1000);
		service.execute(readWork);
		service.execute(readWork);
		service.execute(readWork);
		// -----------------------------------------------------

	}

}
