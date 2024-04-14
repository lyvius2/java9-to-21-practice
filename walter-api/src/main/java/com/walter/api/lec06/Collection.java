package com.walter.api.lec06;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collection {
	public static void main(String[] args) {
		List<Integer> list = Stream.of(1, 2, 3, 4, 5)
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toUnmodifiableList());

		list.forEach(System.out::println);
	}
}
