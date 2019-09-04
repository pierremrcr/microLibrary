package com.client.microclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.client.microclient")
public class MicroclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroclientApplication.class, args);
	}

}
