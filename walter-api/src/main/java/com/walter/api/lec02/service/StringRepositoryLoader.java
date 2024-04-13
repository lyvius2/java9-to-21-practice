package com.walter.api.lec02.service;

import java.util.ServiceLoader;

import com.walter.domain.service.StringRepository;

public class StringRepositoryLoader {
	private static final String DEFAULT = "com.walter.domain.service.DatabaseStringRepository";

	public static StringRepository getDefault() {
		return getRepository(DEFAULT);
	}

	private static StringRepository getRepository(String name) {
		for (StringRepository repository : ServiceLoader.load(StringRepository.class)) {
			if (repository.getClass().getName().equals(name)) {
				return repository;
			}
		}
		throw new IllegalArgumentException("원하는 Service를 찾을 수 없습니다.");
	}
}
