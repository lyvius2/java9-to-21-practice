package com.walter.api.lec02;

import java.lang.reflect.Field;

import com.walter.domain.Lec02PersonDomain;

public class Main {
	public static void main(String[] args) throws Exception {
		final Lec02PersonDomain p = new Lec02PersonDomain();

		Class<Lec02PersonDomain> personDomainClass = Lec02PersonDomain.class;
		Field weight = personDomainClass.getDeclaredField("weight");
		weight.setAccessible(true);

		// 몸무게를 100으로 변경
		weight.set(p, 100);
		System.out.println("weight : " + p.getWeight());
	}
}
