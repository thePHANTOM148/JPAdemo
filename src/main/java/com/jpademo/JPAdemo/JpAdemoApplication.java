package com.jpademo.JPAdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JpAdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpAdemoApplication.class, args);
	}


}
