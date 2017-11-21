package com;

interface Subject {
}

class Java implements Subject {
}

class JavaScript implements Subject {
}

class Trainer<T extends Subject> {

	private T subject;

	public T getSubject() {
		return subject;
	}

	public void setSubject(T subject) {
		this.subject = subject;
	}

}

class Map<K, V> {

}

public class Why_We_Need_Generics_Ex {

	public static void main(String[] args) {

		// Trainer<Java> javaTrainer = new Trainer<Java>();
		// javaTrainer.setSubject(new Java());

		// -------------------------------------
		// javaTrainer.setSubject(new JavaScript());
		// -------------------------------------

		// Object obj = javaTrainer.getSubject();
		// Java java = (Java) obj;

		// Java java = javaTrainer.getSubject();

		// -------------------------------------------

		// Trainer<JavaScript> jsTrainer=new Trainer<>();

		// ----------------------------------------

		// Trainer<String> trainer = new Trainer<>();

		// -------------------------------------------

	}

}
