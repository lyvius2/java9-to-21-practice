package com.walter.api.lec12._switch.pattern;

import java.util.Random;

public non-sealed class Dog extends Animal {
	private String ownerName;

	public String getOwnerName() {
		return ownerName;
	}

	public String bark() {
		return "으르렁컹컹";
	}

	public boolean isQuite() {
		return (new Random()).nextBoolean();
	}
}
