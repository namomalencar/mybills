package com.namom.mybillsconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * Config Application
 * @author Namom Alencar {@literal <namomalencar@gmail.com>}
 * @version 1.0.0
 * @since 1.0.0
 * 
 * */
@EnableConfigServer
@SpringBootApplication
public class MybillsConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybillsConfigApplication.class, args);
	}

}
