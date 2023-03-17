package com.ldb.gold;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldApplication.class, args);
	}

}
