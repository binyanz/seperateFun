package com.example.seperateFun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SeperateFunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeperateFunApplication.class, args);
	}

	@Bean
	public Function<String, String> upperCase() {
		return input -> input.toUpperCase();

	}

}
