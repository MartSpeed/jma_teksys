package com.example.ex_Thymeleafproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class exThymeleafProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(exThymeleafprojectApplication.class, args);
	}

}
