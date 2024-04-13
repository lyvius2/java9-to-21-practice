package com.walter.domain.lec02;

public class Lec02DomainPerson {
	private int weight;
	public String name;

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Lec02DomainPerson{" +
				   "weight=" + weight +
				   '}';
	}
}
