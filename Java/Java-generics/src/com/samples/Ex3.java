package com.samples;

interface Subject {
}

class Java implements Subject {
}

class JavaScript implements Subject {
}

class Trainer<T extends Subject> {

	T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

public class Ex3 {

	public static void main(String[] args) {

		Trainer<Java> javaTrainer = new Trainer<>();

	}

}
