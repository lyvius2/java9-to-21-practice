package com.walter.api.lec09;

import com.walter.api.lec09.instance.Cat;

public class Main {
	public static void main(String[] args) {
		final Cat cat = new Cat();
		System.out.println(cat.sound(cat));
	}
}
