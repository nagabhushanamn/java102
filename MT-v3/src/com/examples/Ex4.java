package com.examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex4 {

	public static void main(String[] args) {

		Callable<String> readFile1 = () -> {
			StringBuilder sb = null;
			try (FileReader fr = new FileReader("file1.txt"); BufferedReader br = new BufferedReader(fr);) {
				sb = new StringBuilder();
				String line = null;
				while ((line = br.readLine()) != null)
					sb.append(line);
			} catch (Exception e) {
				throw e;
			}
			return sb.toString();
		};
		Callable<String> readFile2 = () -> {
			StringBuilder sb = null;
			try (FileReader fr = new FileReader("file2.txt"); BufferedReader br = new BufferedReader(fr);) {
				sb = new StringBuilder();
				String line = null;
				while ((line = br.readLine()) != null)
					sb.append(line);
			} catch (Exception e) {
				throw e;
			}
			return sb.toString();
		};

		List<Callable<String>> tasks = new ArrayList<>();
		tasks.add(readFile1);
		tasks.add(readFile2);

		ExecutorService service = Executors.newFixedThreadPool(2);

		try {
			List<Future<String>> futures = service.invokeAll(tasks);
			for (Future<String> future : futures) {
				System.out.println(future.get());
			}
		} catch (ExecutionException | InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
