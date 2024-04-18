package com.walter.api.lec11;

import com.walter.api.lec10.FruitDto;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		final String str1 = """
				A
				BC
				DEF
				""".indent(3);
		System.out.println(str1);

		final String str2 = " A\n   B\n C";
		System.out.println(str2.stripIndent());

		final String str3 = """
				제 이름은 %s 이고
				나이는 %s 입니다.
				""".formatted("walter", 27);
		System.out.println(str3);

		List<FruitDto> fruits = List.of(
			new FruitDto("사과", 100, LocalDateTime.now()),
			new FruitDto("파인애플", 200, LocalDateTime.now()),
			new FruitDto("바나나", 300, LocalDateTime.now()),
			new FruitDto("수박", 500, LocalDateTime.now())
		);

		int result = fruits.stream()
			.collect(Collectors.teeing(
				Collectors.minBy(Comparator.comparingInt(FruitDto::price)),
				Collectors.maxBy(Comparator.comparingInt(FruitDto::price)),
				(f1, f2) -> {
					f1.ifPresent(f -> System.out.printf("가장 싼 과일은 %s 입니다.\n", f.name()));
					f2.ifPresent(f -> System.out.printf("가장 비싼 과일은 %s 입니다.\n", f.name()));
					return 0;
				}
			));

		// Stream toList
		List<Integer> priceList = fruits.stream()
										.map(FruitDto::price)
										.toList();

		// JDK 17 Random Class
		RandomGeneratorFactory.all().forEach(f -> System.out.println(f.name()));
	}
}
