package com.ex.multi;

import java.util.concurrent.TimeUnit;

// sleep

public class Ex3 {

	public static void main(String[] args) throws InterruptedException {

		String[] items = { "veg-biryani", "egg-biryani", "thali" };
		for (String item : items) {
			// Thread.sleep(2000, 1000);
			TimeUnit.SECONDS.sleep(2);
			System.out.println(item);
		}

	}

}
