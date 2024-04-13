package com.walter.api.lec04;

import java.util.Optional;

public class OptionalSample {
	public static void optional(Optional<String> str) {
		str.ifPresentOrElse(
			s -> System.out.println(s),
			() -> {
				// 값이 없으면 미출력
			}
		);
	}
	public static void main(String[] args) {
		final Optional<String> optional1 = Optional.ofNullable(null);
		optional(optional1);
		final Optional<String> optional2 = Optional.of("ABC");
		optional(optional2);
	}
}
