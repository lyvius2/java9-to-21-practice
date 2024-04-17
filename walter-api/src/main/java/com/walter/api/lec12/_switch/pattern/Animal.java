package com.walter.api.lec12._switch.pattern;

import com.walter.api.lec12.service.AnimalType;

public sealed abstract class Animal permits Dog, Cat {
	protected AnimalType animalType;

	public AnimalType getType() {
		return this.animalType;
	}
}
