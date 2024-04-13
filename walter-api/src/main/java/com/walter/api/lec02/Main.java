package com.walter.api.lec02;

import java.lang.reflect.Field;

import com.walter.api.lec02.dto.Lec02Person;

public class Main {
	public static void main(String[] args) throws Exception {
		final Lec02Person p = new Lec02Person();

		Class<Lec02Person> personDomainClass = Lec02Person.class;
		Field weight = personDomainClass.getDeclaredField("weight");
		weight.setAccessible(true);

		// 몸무게를 100으로 변경
		weight.set(p, 100);
		System.out.println("weight : " + p.getWeight());
	}
}
