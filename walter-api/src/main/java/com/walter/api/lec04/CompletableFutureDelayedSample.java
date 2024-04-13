package com.walter.api.lec04;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDelayedSample {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Executor executor = CompletableFuture.delayedExecutor(5, TimeUnit.SECONDS);
		Runnable sleep = () -> {
			System.out.println(System.currentTimeMillis() + " - 작업 완료");
		};

		System.out.println(System.currentTimeMillis() + " - 작업 실행");
		CompletableFuture<Void> future = CompletableFuture.runAsync(sleep, executor);

		future.get();
	}
}
