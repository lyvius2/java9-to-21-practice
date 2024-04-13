package com.walter.api.lec02;

import java.lang.reflect.Field;

// Deep Reflection
public class DeepReflectionSample {
	public static void main(String[] args) throws Exception {
		Class<?> personClass = Class.forName("com.walter.domain.lec02.Lec02DomainPerson");
		Field weight = personClass.getDeclaredField("weight");
		weight.setAccessible(true);

		Object p = personClass.getConstructor().newInstance();

		// 체중을 100으로 변경
		weight.set(p, 100);
		System.out.println(p);
	}
}
