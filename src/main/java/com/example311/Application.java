package com.example311;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example311")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
