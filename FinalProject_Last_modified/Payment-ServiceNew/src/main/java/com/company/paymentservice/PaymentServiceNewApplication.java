package com.company.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableWebSecurity
@EnableSwagger2
public class PaymentServiceNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceNewApplication.class, args);
	}

}
