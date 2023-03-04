package com.devprobelms.entity;


import jakarta.persistence.*;
import lombok.Data;

/*
 *  @author: DevProblems(Sarang Kumar A Tak)
 *  Youtube channel: https://youtube.com/@devproblems
 */
@Entity
@Table
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String customerName;

}
