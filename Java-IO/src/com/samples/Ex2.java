package com.samples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) throws IOException {

		try (FileReader fis = new FileReader("input.txt"); 
				FileWriter fos = new FileWriter("output.txt");) {

			int i; // 16-bit
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
