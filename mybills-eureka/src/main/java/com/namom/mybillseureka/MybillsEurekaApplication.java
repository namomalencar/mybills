package com.namom.mybillseureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * Eureka Server
 * @author Namom Alencar {@literal <namomalencar@gmail.com>}
 * @version 1.0.0
 * @since 1.0.0
 * 
 * */
@EnableEurekaServer
@SpringBootApplication
public class MybillsEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybillsEurekaApplication.class, args);
	}

}
