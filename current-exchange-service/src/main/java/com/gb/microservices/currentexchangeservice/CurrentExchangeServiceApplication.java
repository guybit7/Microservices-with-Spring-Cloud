package com.gb.microservices.currentexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrentExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrentExchangeServiceApplication.class, args);
	}

}
