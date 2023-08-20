package com.virtusa.hackathon.chistory.credithistoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CredithistoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredithistoryserviceApplication.class, args);
	}
}
