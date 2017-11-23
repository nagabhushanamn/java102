package com.samples;

import java.io.Serializable;

public class Location implements I {

	private String name;

	public Location(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Location [name=" + name + "]";
	}

}
