package com.samples.components;

import com.samples.container.annotations.HttpMethod;
import com.samples.container.annotations.URLMapping;

@URLMapping
public class Component {

	@URLMapping
	public void doSomething() {
		System.out.println("/");
	}

	@URLMapping(url = "/register", method = HttpMethod.POST)
	public void register() {
		System.out.println("/register");
	}

	// @URLMapping(url = "/login", method = HttpMethod.GET)
	// public void showLoginForm() {
	// System.out.println("/login");
	// }

	@URLMapping(url = "/login", method = HttpMethod.POST)
	public void login(String user,String password) {
		System.out.println("/login");
		System.out.println(user);
		System.out.println(password);
	}

}
