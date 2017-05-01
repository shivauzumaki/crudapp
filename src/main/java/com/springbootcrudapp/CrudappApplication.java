package com.springbootcrudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


import com.springbootcrudapp.configuration.JpaConfiguration;
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.springbootcrudapp"})
public class CrudappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudappApplication.class, args);
	}
}
