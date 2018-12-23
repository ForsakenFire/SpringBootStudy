package com.iss.td;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:test.properties")
public class Bootstudy1Application {

	public static void main(String[] args) {
		SpringApplication.run(Bootstudy1Application.class, args);
	}

}

