package com.walter.api.lec02;

import java.lang.reflect.Field;

import com.walter.domain.lec02.Lec02DomainPerson;

public class ShallowReflectionSample {
	public static void main(String[] args) throws Exception {
		Lec02DomainPerson p = new Lec02DomainPerson();
		Class<Lec02DomainPerson> clazz = Lec02DomainPerson.class;
		Field name = clazz.getDeclaredField("name");

		name.set(p, "ABC");
		System.out.println(p.getName());
	}
}
