package com.virtusa.hackathon.cis.customerinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories("com.virtusa.hackathon.cis.customerinfoservice.repository")
@ComponentScans({ @ComponentScan("com.virtusa.hackathon.cis.customerinfoservice.controller") })
@EntityScan("com.virtusa.hackathon.cis.customerinfoservice.model")
public class CustomerinfoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerinfoserviceApplication.class, args);
	}

}
