package com.microservices.loans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservices.loans.service")
public class LoansServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansServiceApplication.class, args);
	}

}
