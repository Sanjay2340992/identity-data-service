package com.bizruntime.ids.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bizruntime.ids")
public class IdentityDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentityDataServiceApplication.class, args);
	}

}
