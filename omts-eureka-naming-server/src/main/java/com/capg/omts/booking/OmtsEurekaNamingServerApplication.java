package com.capg.omts.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OmtsEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmtsEurekaNamingServerApplication.class, args);
	}

}