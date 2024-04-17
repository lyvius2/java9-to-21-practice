package com.walter.api.lec12.service;

import com.walter.api.lec12._switch.pattern.Animal;
import com.walter.api.lec12._switch.pattern.Dog;

public class AnimalService {
	public AnimalDto getInformation(AnimalType type, long id) {
		//Animal animal = animalRepository.findByTypeAndId(type, id);
		Animal animal = new Dog();
		return AnimalDto.of(animal);
	}
}
