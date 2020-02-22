package com.example.demo;

import com.example.demo.domain.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CarRepository carRepository) {
		return args -> {
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
			carRepository.save(new Car("Ford", "Modeo", "Red", 1993));
		};
	}

}
