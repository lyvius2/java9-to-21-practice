package com.walter.api.lec04;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTimeoutSample {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		timeout();
	}

	public static void timeout() throws ExecutionException, InterruptedException {
		System.out.println(System.currentTimeMillis() + " - 작업 실행 TimeOut");
		CompletableFuture<Void> future1 = CompletableFuture.runAsync(getRunnable())
														   .orTimeout(1, TimeUnit.SECONDS);
		// 비동기 작업이 끝날때까지 Main Thread를 멈추는 기능
		try {
			future1.get();
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println(System.currentTimeMillis() + " - 작업 실행 Complete on TimeOut");
		CompletableFuture<Void> future2 = CompletableFuture.runAsync(getRunnable())
														   .completeOnTimeout(null, 1, TimeUnit.SECONDS);

		System.out.println("future 2 : " + (future2.get() == null));
	}

	// 10초간 기다렸다가 작업 완료를 출력하는 Runnable
	public static Runnable getRunnable() {
		return () -> {
			try {
				Thread.sleep(10_000L);
				System.out.println(System.currentTimeMillis() + " - 작업 완료");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		};
	}
}
