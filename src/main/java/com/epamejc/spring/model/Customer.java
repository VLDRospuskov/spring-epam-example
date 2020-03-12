package com.epamejc.spring.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private Integer age;

    @Column(name = "created_at")
    private Instant instant = Instant.now();

}

// IDENTITY
// t1 1 2 3 4 5
// t2 1 2 3 4 5

// SEQUENCE
// t1 1 3 6 7 8 9 10
// t2 2 4 5 11