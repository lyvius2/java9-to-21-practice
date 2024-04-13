package com.walter.api.lec04;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 2);	// 불변
		nums.add(3);	// 에러 발생
		// Set 객체의 of 메서드는 Collection 객체를 생성하는 정적 메서드로 요소들을 생성한 뒤 바로 저장하기 때문에 메모리를 덜 차지하고 리소스 활용에 효율적 -> 불변 Set를 만들거라면 정적 메서드 of를 사용하는 것이 낫다.
	}
}
