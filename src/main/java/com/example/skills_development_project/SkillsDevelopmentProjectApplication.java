package com.example.skills_development_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SkillsDevelopmentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsDevelopmentProjectApplication.class, args);
		System.out.println("Hello world");
	}

	@GetMapping("/")
	public String rootEndPoint(){
		String message ="Hello world";
		return message;
	}

}
