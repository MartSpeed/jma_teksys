package com.example.ex_TeksysServlet;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExTeksysServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExTeksysServletApplication.class, args);
		// building a basic controller
	}

	@Bean
	public CommandLineRunner commandRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Beanspection from Spring");
			
			String[] beanName = ctx.getBeanDefinitionNames();
			Arrays.sort(beanName);
			for(String bName : beanName) {
				System.out.println(bName);
			}
		};
	}
}
