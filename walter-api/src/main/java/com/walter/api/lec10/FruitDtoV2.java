package com.walter.api.lec10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;

// Serialize 시 jackson 2.12.0 이상 채택 필요 (SpringBoot 2.5.x 이상에 자동 적용)
public record FruitDtoV2(
	String name,

	@MyAnnotation
	int price,
	LocalDate date
) {
	private static final double DISCOUNT_RATE = 0.3;

	public int getDiscountPrice() {
		return (int) (price * (1.0 - DISCOUNT_RATE));
	}

	//compact constructor - 매개변수의 값을 받지않아 코드가 간결해짐
	public FruitDtoV2 {
		System.out.println("기본 Record 생성자 기능이 자동으로 수행됨.");
		if (price < 0) {
			throw new IllegalArgumentException("과일의 가격은 양수입니다.");
		}
	}

	/*
		public FruitDtoV2(String name, int price, LocalDate date) {
			System.out.println("생성자 호출!");
			this.name = name;
			this.price = price;
			this.date = date;
		}
	*/
	public String name() {
		return "[재정의] " + this.name;
	}
}

@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.FIELD)  // 특정 요소에만 애노테이션을 적용하고자 할 때
@interface MyAnnotation {

}
