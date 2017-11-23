package com.samples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) throws IOException {

		try (FileReader fr = new FileReader("input.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("output.txt");) {

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				fw.write(line); // buffer
				fw.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Read/Write successfull");

	}

}
