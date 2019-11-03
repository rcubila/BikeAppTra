package com.globomatics.bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.globomatics.bike"})
@SpringBootApplication
public class BikeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeApplication.class, args);
	}

}
