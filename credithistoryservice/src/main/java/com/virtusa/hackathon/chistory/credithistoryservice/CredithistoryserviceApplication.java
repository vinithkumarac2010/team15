package com.virtusa.hackathon.chistory.credithistoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EntityScan("com.virtusa.hackathon.chistory.model")
//@EnableJpaRepositories("com.virtusa.hackathon.chistory.repository")
@SpringBootApplication
@EnableEurekaClient
@ComponentScans({ @ComponentScan("com.virtusa.hackathon.chistory.controller") })
public class CredithistoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CredithistoryserviceApplication.class, args);
	}
}
