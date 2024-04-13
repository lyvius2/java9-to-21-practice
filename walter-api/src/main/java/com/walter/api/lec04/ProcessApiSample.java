package com.walter.api.lec04;

public class ProcessApiSample {
	public static void main(String[] args) {
		System.out.println(ProcessHandle.current().pid());
	}
}
