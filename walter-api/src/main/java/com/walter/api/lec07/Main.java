package com.walter.api.lec07;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws Exception {
		// String repeat
		String str = " A";
		System.out.println(str.repeat(3));

		// Collection API : toArray
		List<String> strings = List.of("A", "B", "C");
		String[] result = strings.toArray(String[]::new);
		for (String string : result) {
			System.out.println(string);
		}

		// Predicate
		List<String> list = List.of("A", " ", "   ");
		List<String> filterResult = list.stream()
										.filter(Predicate.not(String::isBlank))
										.collect(Collectors.toList());
		filterResult.forEach(System.out::println);

		// Read File
		var absolutePath = Paths.get(".").toAbsolutePath();
		var path = Paths.get(absolutePath + "/walter-api/test1.txt");
		String fileText = Files.readString(path);
		System.out.println(fileText);

		// Write File
		Files.writeString(Paths.get(absolutePath + "/walter-api/test2.txt"), "가나다라마바사", UTF_8);
	}
}
