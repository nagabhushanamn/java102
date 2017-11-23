package com.samples;

import java.awt.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serialization_Ex {

	public static void main(String[] args) throws IOException {

		Product product = new Product(213123, "Laptop", 1000.00);

		// B b = new B();

		X x1 = new X();
		X x2 = new X();

		java.util.List<X> list = Arrays.asList(x1, x2);

		// ------------------------------------------
		File file = new File("product.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(product);
		oos.close();
		fos.close();

		System.out.println("Product serialized...");

		// ------------------------------------------

	}

}
