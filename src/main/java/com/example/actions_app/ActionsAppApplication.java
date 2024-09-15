package com.example.actions_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.actions_app.entity")
@EnableJpaRepositories(basePackages = "com.example.actions_app.repository")
public class ActionsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionsAppApplication.class, args);
	}

}
