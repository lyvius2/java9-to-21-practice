package com.walter.api.lec06;

import java.util.Optional;

public class OptionalException {
	public static void main(String[] args) {
		Optional.ofNullable(3)
				.orElseThrow();
	}
}
