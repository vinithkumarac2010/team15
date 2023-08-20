package com.virtusa.hackaton.cscorecalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.virtusa.hackaton.service")
@RefreshScope
@ComponentScans({ @ComponentScan("com.virtusa.hackaton.cscorecalc.controller")})
public class CreditscorecalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditscorecalcApplication.class, args);
	}

}
