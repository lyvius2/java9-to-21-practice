package com.walter.api.lec16;

import java.util.Random;
import java.util.random.RandomGenerator;

public class ConstantV2 {
	private static final ScopedValue<Integer> randomNumber = ScopedValue.newInstance();

	public static void main(String[] args) {
		final RandomGenerator generator = new Random();
		ScopedValue.where(ConstantV2.randomNumber, generator.nextInt(10))
				.run(() -> {
					test1();
					//

					test2();
				});
	}

	private static void test1() {
		System.out.println(STR."test1 : \{randomNumber.get()}");
	}

	private static void test2() {
		System.out.println(STR."test2 : \{randomNumber.get()}");
	}
}
