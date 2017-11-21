package com.samples;

@FunctionalInterface
interface Greeter {
	void greet();
}

class GreetUtil {
	public void sayHello(Greeter greeter) {
		if (greeter != null) {
			greeter.greet();
			return;
		}
		System.out.println("Hello....");
	}
}

public class Ex2 {

	public static void main(String[] args) {
		GreetUtil greetUtil = new GreetUtil();
		greetUtil.sayHello(null);
		greetUtil.sayHello(new Greeter() {
			@Override
			public void greet() {
				System.out.println("Ola...");
			}
		});
		greetUtil.sayHello(() -> System.out.println("Ola.."));
	}

}
