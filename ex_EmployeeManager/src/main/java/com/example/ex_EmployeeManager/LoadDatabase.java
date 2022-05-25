package com.example.ex_EmployeeManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.EmployeeEntity;
import repository.EmployeeRepository;

// [] the configuration does what???
@Configuration
public class LoadDatabase {
	// he is going to explain "LOGGERS" later
	// [] look up "LOGGERS"
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	// [] look up what "@Bean" is and what they mean
	// [] create the "EmployeeRepository"
	@Bean
	CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
		//
		EmployeeEntity e1 = new EmployeeEntity("Zorojuro", "Helmsman");
		// because we have use @AllArgs
		return args -> {
		// 
		log.info("Preloading " + employeeRepository.save(e1));
		// this is the "INLINE" way to make the employee object constructor
		log.info("Preloading " + employeeRepository.save(new EmployeeEntity("Tashigi Moon", "Sword Hunter")));
	};
}
}
