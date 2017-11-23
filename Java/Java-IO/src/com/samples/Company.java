package com.samples;

import java.io.Serializable;

public class Company implements Serializable {

	private String name;
	private Location location = new Location("Delhi");

	public Company(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
