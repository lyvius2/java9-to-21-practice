package com.walter.api.lec15;

public class ThreadSample {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			int threadNum = i + 1;
			Thread t = new Thread() {
				@Override
				public void run() {
					printWithThread(String.format("스레드 %s번 실행", threadNum));
				}
			};
			t.start();
		}

		Thread.sleep(5_000L);
	}

	private static void printWithThread(Object obj) {
		System.out.printf("[%s] %s\n", Thread.currentThread().getName(), obj);
	}
}
