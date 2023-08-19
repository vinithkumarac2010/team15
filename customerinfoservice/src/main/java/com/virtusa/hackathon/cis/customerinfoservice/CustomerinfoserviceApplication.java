package com.virtusa.hackathon.cis.customerinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerinfoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerinfoserviceApplication.class, args);
	}

}
