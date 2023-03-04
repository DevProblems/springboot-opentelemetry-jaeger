package com.devprobelms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  @author: DevProblems(Sarang Kumar A Tak)
 *  Youtube channel: https://youtube.com/@devproblems
 */
@SpringBootApplication
public class MsTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTwoApplication.class, args);
	}

}

@RestController
@RequestMapping("/")
class MsTwoController {

	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("hello from ms-two");
	}
}
