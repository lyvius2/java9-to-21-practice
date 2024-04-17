package com.walter.api.lec12.service;

import com.walter.api.lec12._switch.pattern.Animal;
import com.walter.api.lec12._switch.pattern.Cat;
import com.walter.api.lec12._switch.pattern.Dog;

public sealed interface AnimalDto {
	static AnimalDto of(Animal animal) {
		/*
		return switch (animal) {
			case Dog dog -> DogDto.of(dog);
			case Cat cat -> CatDto.of(cat);
		};
		 */
		return switch (animal.getType()) {
			case DOG -> DogDto.of((Dog) animal);
			case CAT -> CatDto.of((Cat) animal);
		};
	}
}

record DogDto(
	String ownerName
) implements AnimalDto {
	public static DogDto of(Dog dog) {
		return new DogDto(dog.getOwnerName());
	}
}

record CatDto(
	String name,
	int age
) implements AnimalDto {
	public static CatDto of(Cat cat) {
		return new CatDto(cat.getName(), cat.getAge());
	}
}