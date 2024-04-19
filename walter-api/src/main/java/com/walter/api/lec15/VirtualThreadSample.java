package com.walter.api.lec15;

import com.walter.api.lec15.util.Printer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class VirtualThreadSample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Thread t = Thread.ofVirtual()
				.start(() -> Printer.printWithThread("Hello, Virtual Thread!"));
		t.join();

		Thread t2 = Thread.startVirtualThread(() -> System.out.println("Hello~~ Virtual Thread."));

		try (ExecutorService myExecutor = Executors.newVirtualThreadPerTaskExecutor()) {
			Future<?> future = myExecutor.submit(() -> Printer.printWithThread("Hello! Virtual Thread!!!!"));
			future.get();
		}
	}
}
