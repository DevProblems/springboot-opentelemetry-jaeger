package com.devprobelms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
 *  @author: DevProblems(Sarang Kumar A Tak)
 *  Youtube channel: https://youtube.com/@devproblems
 */
@SpringBootApplication
public class MsOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsOneApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}









