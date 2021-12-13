package com.example.databookconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DatabookConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabookConfigServerApplication.class, args);
	}

}
