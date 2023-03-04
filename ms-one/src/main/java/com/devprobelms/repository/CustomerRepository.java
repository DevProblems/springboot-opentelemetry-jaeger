package com.devprobelms.repository;

import com.devprobelms.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 *  @author: DevProblems(Sarang Kumar A Tak)
 *  Youtube channel: https://youtube.com/@devproblems
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {}
