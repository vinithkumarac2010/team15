package com.virtusa.hackaton.cscorecalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CreditscorecalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditscorecalcApplication.class, args);
	}

}
