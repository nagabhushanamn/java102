package com;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.lib.Driver;

public class Ex {

	public static void main(String[] args) throws Exception {

		Class<?> clazz = Class.forName("com.lib.Driver");

		// constructor
		// Object instance = clazz.newInstance();

		// methods
		// Method method = clazz.getMethod("pubMethod", new Class[] {});
		// method.invoke(instance, new Object[] {});
		//
		// Method priMethod = clazz.getDeclaredMethod("priMethod", new Class[] {});
		// priMethod.setAccessible(true);
		// priMethod.invoke(instance, new Object[] {});

		// fields
		// Field field = clazz.getDeclaredField("pri");
		// field.setAccessible(true);
		// field.set(instance, "NEW PRIVATE");
		// System.out.println(field.get(instance));

		// --------------------------------------------------

	}

}
