package com.walter.api.lec07;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestClient {
	public static void main(String[] args) throws Exception {
		var client = HttpClient.newHttpClient();

		var request = HttpRequest.newBuilder(URI.create("https://postman-echo.com/post"))
								 .POST(HttpRequest.BodyPublishers.ofString("{\"num\": 1}"))
								 .build();

		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
			.thenAccept((res) -> {
				printWithThread(res.statusCode());
				printWithThread(res.body());
			});

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		printWithThread(response.statusCode());
		printWithThread(response.body());
	}

	private static void printWithThread(Object obj) {
		System.out.printf("%s %s\n%n", Thread.currentThread().getName(), obj);
	}
}
