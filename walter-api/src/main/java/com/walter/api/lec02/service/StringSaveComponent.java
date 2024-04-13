package com.walter.api.lec02.service;

import com.walter.domain.service.StringRepository;

public class StringSaveComponent {
	private final StringRepository stringRepository = StringRepositoryLoader.getDefault();

	public void mainLogic() {
		stringRepository.save("문자열");
	}

	public static void main(String[] args) {
		StringSaveComponent stringSaveComponent = new StringSaveComponent();
		stringSaveComponent.mainLogic();
	}
}
