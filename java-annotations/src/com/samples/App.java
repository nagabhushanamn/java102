package com.samples;

import com.samples.container.Container;

public class App {

	public static void main(String[] args) throws Exception {

		Container container = new Container();
		container.process("/login", "POST","user","password");

	}

}
