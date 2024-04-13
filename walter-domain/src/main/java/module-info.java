//open
module com.walter.domain {
	exports com.walter.domain;
	exports com.walter.domain.service;
	exports com.walter.domain.lec02;
	opens com.walter.domain.lec02;

	provides com.walter.domain.service.StringRepository with
			com.walter.domain.service.DatabaseStringRepository,
			com.walter.domain.service.MemoryStringRepository;
}