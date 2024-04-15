package com.walter.api.lec09;

import static com.walter.api.lec09.Color.GREEN;

public class SwitchExpression {
	public static void main(String[] args) {
		System.out.println(calculateTestGrade(3));
		System.out.println(arrowCaseLabel(6));
		final String signal = Color.getSignal(GREEN);
		System.out.println(signal);
	}

	private static String calculateTestGrade(int score) {
		return switch (score) {
			case 5:
				yield "A";
			case 4, 3:
				yield "B";
			case 2, 1:
				yield "C";
			default:
				yield "F";
		};
	}

	private static String arrowCaseLabel(int score) {
		return switch (score) {
			case 6 -> {
				System.out.println(score + "!");
				yield "H";
			}
			case 5 -> "A";
			case 4, 3 -> "B";
			case 2, 1 -> "C";
			case 0 -> throw new IllegalArgumentException();
			default -> "F";
		};
	}
}
