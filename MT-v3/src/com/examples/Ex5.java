package com.examples;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex5 {

	public static void main(String[] args) {

		Runnable r = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Hello");
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Bye");
		};

		ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
		service.scheduleWithFixedDelay(r, 0, 1, TimeUnit.SECONDS);

		// service.shutdown();
	}

}
