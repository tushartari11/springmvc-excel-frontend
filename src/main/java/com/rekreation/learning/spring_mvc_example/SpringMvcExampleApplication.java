package com.rekreation.learning.spring_mvc_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringMvcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExampleApplication.class, args);
	}

}
