package com.walter.api.lec09;

public enum Color {
	RED, YELLOW, GREEN;

	public static String getSignal(Color color) {
		return switch(color) {
			case RED -> "STOP!";
			case YELLOW ->  "STAND BY";
			case GREEN -> "GO";
		};
	}
}
