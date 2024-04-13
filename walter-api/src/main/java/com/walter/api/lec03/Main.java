package com.walter.api.lec03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	@SafeVarargs
	public static <T> List<T> flatten(List<T>... lists) {
		List<T> result = new ArrayList<>();
		for (List<T> list : lists) {
			result.addAll(list);
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 2, 3);
		List<Integer> list2 = List.of(4, 5);
		List<Integer> result = flatten(list1, list2);
		System.out.println(result);
	}
}
