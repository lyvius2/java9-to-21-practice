package com.walter.api.lec14;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SequencedMap;

public class Main {
	public static void main(String[] args) {
		// targetValue가 min, max 사이에 있는지 체크 : 있으면 value, min보다 작으면 min, max보다 크면 max값 리턴
		final int targetValue = 10;
		int result = Math.clamp(targetValue, 5, 15);
		System.out.println(result);

		String str = "A;B;C";
		String[] result1 = str.split(";");  // array size : 3
		String[] result2 = str.splitWithDelimiters(";", -1);    // array size : 5

		StringBuilder sb = new StringBuilder();
		sb.repeat("ABC ", 3);
		System.out.println(sb);

		System.out.println(Character.isEmoji(128512));

		List<Integer> numbers = List.of(1, 2, 3, 4);
		System.out.println(numbers.getLast());

		List<Integer> nums = new ArrayList<>(numbers);
		List<Integer> reversed = nums.reversed();
		nums.add(5);
		System.out.println(reversed);
		reversed.addFirst(6);
		System.out.println(nums);

		SequencedMap<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "A");
		map.put(2, "B");

		try {
			var entry = map.firstEntry();   // 불변
			entry.setValue("D");
		} catch (Exception e) {
			System.out.println(e);
		}

		var entry_iter = map.entrySet().iterator().next();
		entry_iter.setValue("C");
		System.out.println(map);
	}
}
