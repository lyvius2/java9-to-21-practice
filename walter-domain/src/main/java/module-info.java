//open
module com.walter.domain {
	exports com.walter.domain;
	opens com.walter.domain;

	provides com.walter.domain.service.StringRepository with
			com.walter.domain.service.DatabaseStringRepository,
			com.walter.domain.service.MemoryStringRepository;
}