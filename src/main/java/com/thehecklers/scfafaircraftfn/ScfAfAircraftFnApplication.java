package com.thehecklers.scfafaircraftfn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class ScfAfAircraftFnApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScfAfAircraftFnApplication.class, args);
	}

	@Bean
	Function<String, String> echo() {
		return s -> s;
	}

	@Bean
	Function<Aircraft, Aircraft> ac() {
		return ac -> {
			System.out.println(" 🛩️  " + ac.toString());
			return new Aircraft(ac.getAdshex(), ac.getReg(), ac.getType());
		};
	}
}
