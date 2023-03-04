package com.devprobelms.controller;

import com.devprobelms.entity.Customer;
import com.devprobelms.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/*
 *  @author: DevProblems(Sarang Kumar A Tak)
 *  Youtube channel: https://youtube.com/@devproblems
 */
@RestController
@RequestMapping("/customer")
public class MsOneController {

    private final RestTemplate restTemplate;
    private final CustomerRepository customerRepository;

    public MsOneController(RestTemplate restTemplate, CustomerRepository customerRepository) {
        this.restTemplate = restTemplate;
        this.customerRepository = customerRepository;
    }

    @PostMapping
    public ResponseEntity<Customer> post(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerRepository.save(customer));
    }

    @GetMapping
    public ResponseEntity<String> get() {
        return restTemplate.getForEntity("http://ms-two:8081/", String.class);
    }
}
