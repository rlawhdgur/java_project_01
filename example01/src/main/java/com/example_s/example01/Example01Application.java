package com.example_s.example01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class Example01Application {

	public static void main(String[] args) {
		SpringApplication.run(Example01Application.class, args);
	}
}

@RestController
class Helloworld {
        @GetMapping("/")
        public String greet() {
                return "Spring with VS code!!";
		}
}