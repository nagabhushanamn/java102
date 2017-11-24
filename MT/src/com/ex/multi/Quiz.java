package com.ex.multi;

class T extends Thread {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "- im Running..");
	}
}

public class Quiz {

	public static void main(String[] args) {
		T t = new T();
		t.run(); // this will not create new thread
	}

}
