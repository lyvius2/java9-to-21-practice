package com.walter.api.lec06;

import java.util.ArrayList;
import java.util.List;

public class DeepCopy {
	public static void main(String[] args) {
		List<Integer> oldNums = new ArrayList<>();
		oldNums.add(1);
		oldNums.add(2);

		List<Integer> newNums = List.copyOf(oldNums);
		oldNums.add(3);

		oldNums.forEach(num -> System.out.println("old num : " + num));
		newNums.forEach(num -> System.out.println("new num : " + num));
	}
}
