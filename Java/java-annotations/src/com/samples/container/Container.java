package com.samples.container;

import java.lang.reflect.Method;

import com.samples.components.Component;
import com.samples.container.annotations.URLMapping;

// 

public class Container {

	public void process(String url, String httpMethod,String user,String password) throws Exception {

		//Class<?> compClazz = Class.forName("com.samples.components.Component");
		//Object instance = compClazz.newInstance();
		
		Component instance=new Component();
		Class<?> compClazz=instance.getClass();

		Method[] methods = compClazz.getMethods();
		for (Method method : methods) {
			URLMapping urlMapping = method.getAnnotation(URLMapping.class);
			if (urlMapping != null) {
				String urlValue = urlMapping.url();
				if (url.equals(urlValue)) {
					method.invoke(instance, new Object[] {user,password});
				}
			}
		}

	}

}
