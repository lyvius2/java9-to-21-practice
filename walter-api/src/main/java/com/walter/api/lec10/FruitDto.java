package com.walter.api.lec10;

import java.time.LocalDateTime;
import java.util.Objects;

public final class FruitDto {
	private final String name;
	private final int price;
	private final LocalDateTime date;

	public FruitDto(String name, int price, LocalDateTime date) {
		this.name = name;
		this.price = price;
		this.date = date;
	}

	public String name() {
		return name;
	}

	public int price() {
		return price;
	}

	public LocalDateTime date() {
		return date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof FruitDto fruit)) {
			return false;
		}
		return fruit.name().equals(this.name) && fruit.price == this.price && fruit.date.compareTo(this.date) == 0;
	}

	@Override
	public String toString() {
		return "FruitDto{" +
				"name='" + name + '\'' +
				", price=" + price +
				", date=" + date +
				'}';
	}
}
