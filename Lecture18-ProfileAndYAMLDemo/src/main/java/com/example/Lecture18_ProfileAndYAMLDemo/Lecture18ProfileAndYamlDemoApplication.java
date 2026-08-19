package com.example.Lecture18_ProfileAndYAMLDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lecture18ProfileAndYamlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lecture18ProfileAndYamlDemoApplication.class, args);
	}

}


// External Way For Profiles Using Command Line Configuration. also we have more external way
// 1 .\mvnw.cmd spring-boot:run
//  ctrl+c to stop
// 2. .\mvnw.cmd spring-boot:run "-Dspring-boot.run.profiles=prod"