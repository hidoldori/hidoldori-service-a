package com.example.hidoldoriservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HidoldoriServiceAApplication {

	public static void main(String[] args) {
		SpringApplication.run(HidoldoriServiceAApplication.class, args);
	}

}
