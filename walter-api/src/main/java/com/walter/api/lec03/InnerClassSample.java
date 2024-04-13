package com.walter.api.lec03;

public class InnerClassSample {
	public static void main(String[] args) {
		InnerClass<Integer> ic = new InnerClass<>(3) {};
	}

	public static class InnerClass<T> {
		private final T t;

		public InnerClass(T t) {
			this.t = t;
		}
	}
}
