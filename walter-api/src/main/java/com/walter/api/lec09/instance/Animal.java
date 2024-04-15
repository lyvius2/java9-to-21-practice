package com.walter.api.lec09.instance;

public abstract class Animal {
	public String sound(Animal animal) {
		if (animal instanceof Dog dog) {
			return dog.bark();
		} else if (animal instanceof Cat cat) {
			return cat.purr();
		}
		throw new IllegalArgumentException("다른 경우는 존재하지 않는다.");
	}

	public String soundIfDog(Animal animal) {
		if (!(animal instanceof Dog dog)) {
			return "개가 아닙니다.";
		}

		return dog.bark();
	}
}
