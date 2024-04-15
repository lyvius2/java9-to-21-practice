module com.walter.api {
	requires com.walter.domain;
	uses com.walter.domain.service.StringRepository;

	requires java.net.http;
}