package com.walter.api.lec15.util;

public class Printer {
	public static void printWithThread(Object obj) {
		System.out.printf("[%s] %s\n", Thread.currentThread().getName(), obj);
	}
}
