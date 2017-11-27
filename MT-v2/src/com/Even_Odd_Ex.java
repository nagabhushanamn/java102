package com;

import java.util.concurrent.TimeUnit;

public class Even_Odd_Ex {

	static Object lock = new Object();
	static int flag = 0;

	public static void main(String[] args) {
		Runnable e = () -> {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					if (flag != 0) {
						try {
							lock.wait();
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
					if (i % 2 == 0) {
						System.out.println(i);
						flag = 1;
						lock.notifyAll();
					}
				}
			}
		};
		Runnable o = () -> {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					if (flag != 1) {
						try {
							lock.wait();
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
					if (i % 2 != 0) {
						try {
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						System.out.println(i + "-" + Thread.currentThread().getName());
						flag = 0;
						lock.notifyAll();
					}
				}
			}
		};

		Thread eThread = new Thread(e);
		Thread oThread = new Thread(o, "odd-1");
		eThread.start();
		oThread.start();

	}

}
