package com.walter.api.lec15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolingSample {
	public static void main(String[] args) throws InterruptedException {
		try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
			for (int i = 0; i < 3; i++) {
				int threadNum = i + 1;
				executorService.submit(() -> printWithThread(String.format("스레드 %s번 실행", threadNum)));
			}
		}

		Thread.sleep(5_000L);
	}

	private static void printWithThread(Object obj) {
		System.out.printf("[%s] %s\n", Thread.currentThread().getName(), obj);
	}
}
