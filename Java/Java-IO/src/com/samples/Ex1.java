package com.samples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) throws IOException {

		try (FileInputStream fis = new FileInputStream("input.txt");
				FileOutputStream fos = new FileOutputStream("output.txt");) {

			int i;
			while ((i = fis.read()) != -1) {
				System.out.println(i);
				fos.write(i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Read/Write successfull");

	}

}
