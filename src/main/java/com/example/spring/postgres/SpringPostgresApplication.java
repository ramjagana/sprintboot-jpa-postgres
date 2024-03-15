package com.example.spring.postgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.controller")
@EntityScan(basePackages = {"com.example.data"})
@EnableJpaRepositories(basePackages = {"com.example.repo"})
public class SpringPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPostgresApplication.class, args);
	}

//	@GetMapping("/hello")
//	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//		return String.format("Hello %s!", name);
//	}

}
