package com.walter.api.lec10;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		FruitDtoV2 dto = new FruitDtoV2("사과", 1000, LocalDate.of(2024, 4, 16));
		System.out.println(dto.price());
		System.out.println(dto.name());
		System.out.println(dto);

		try {
			FruitDtoV2 fruitDtoV2 = new FruitDtoV2("파인애플", -100, LocalDate.of(2024, 11,12));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
