package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan("com.ubo.modele")
@EnableJpaRepositories(basePackages = {"com.ubo.repository"})
@Configuration
@Import(SwaggerConfig.class)
@EnableAutoConfiguration
@ComponentScan("com.ubo.controller")

@SpringBootApplication
public class ProjetFadwaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetFadwaApplication.class, args);
	}

}





