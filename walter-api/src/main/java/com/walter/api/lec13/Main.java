package com.walter.api.lec13;

import static java.lang.StringTemplate.RAW;
import static java.util.FormatProcessor.FMT;

public class Main {
	public static void main(String[] args) {
		String name = "walter";
		int age = 24;

		String str = STR."이름 : \{name}, 나이 : \{age}";
		System.out.println(str);

		double num = 1.333;
		String str2 = FMT."숫자 : %.2f\{num}";
		System.out.println(str2);

		StringTemplate template = RAW."이름 : \{name}, 나이 : \{age}";
		System.out.println(template.fragments());
		System.out.println(template.values());
		System.out.println(template.interpolate());
	}

	public static void findDistance(Object object) {
		if (object instanceof Line(Point(var x1, var _), Point(var x2, _))) {
		}
	}

	record Point(double x, double y) {}

	record Line(Point p1, Point p2) {}
}
