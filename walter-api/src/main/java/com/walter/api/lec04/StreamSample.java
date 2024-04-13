package com.walter.api.lec04;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {
	private static final List<Integer> NUMERICS = List.of(10, 5, 26, 3, 20);

	public static void main(String[] args) {
		takeWhileSample();
		dropWhileSample();
		iterateSample();
	}

	private static void takeWhileSample() {
		final List<Integer> takeWhileSample = NUMERICS.stream()
													  .takeWhile(num -> num <= 10)
													  .collect(Collectors.toList());
		final List<Integer> filterSample = NUMERICS.stream()
												   .filter(num -> num <= 10)
												   .collect(Collectors.toList());
		System.out.println("validate takeWhile : " + (takeWhileSample.size() == 2));
		System.out.println("validate filter : " + (filterSample.size() == 3));
		takeWhileSample.forEach(System.out::println);
	}

	private static void dropWhileSample() {
		final List<Integer> dropWhileSample = NUMERICS.stream()
													  .dropWhile(num -> num <= 10)
													  .collect(Collectors.toList());
		dropWhileSample.forEach(System.out::println);
		System.out.println("validate dropWhile : " + (dropWhileSample.size() == 3));
	}

	private static void iterateSample() {
		System.out.println("----- iterateSample -----");
		Stream.iterate(0, i -> i + 2)
			.limit(5)
			.forEach(System.out::println);
		System.out.println("----------");
		Stream.iterate(0, i -> i < 10, i -> i + 2)
			.forEach(System.out::println);
	}
}
