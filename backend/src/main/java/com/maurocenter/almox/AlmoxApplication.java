package com.maurocenter.almox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AlmoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlmoxApplication.class, args);
	}

}
