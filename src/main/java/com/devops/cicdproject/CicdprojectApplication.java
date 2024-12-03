package com.devops.cicdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdprojectApplication {

	public static void main(String[] args) {
		System.out.println("CI CD started......pipeline modified");
		SpringApplication.run(CicdprojectApplication.class, args);
		
	}

}
