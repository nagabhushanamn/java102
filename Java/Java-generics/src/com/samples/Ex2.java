package com.samples;

import java.util.HashMap;

interface Map<K, V> {
	void put(K k, V v);

	V get(K k);
}

class CustomMap<K, V> implements Map<K, V> {

	@Override
	public void put(K k, V v) {
		// .
	}

	@Override
	public V get(K k) {
		return null;
	}

}

public class Ex2 {

	public static void main(String[] args) {

		java.util.Map<String, String> map = new HashMap<>();

	}

}
