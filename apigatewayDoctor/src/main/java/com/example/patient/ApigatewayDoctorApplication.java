package com.example.patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApigatewayDoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayDoctorApplication.class, args);
	}

}
