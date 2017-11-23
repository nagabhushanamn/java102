package com.samples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization_Ex {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File file = new File("product.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		Product product = (Product) obj;
		System.out.println(product);
		System.out.println(product.getCompany());

	}

}
