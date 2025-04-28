package com.sm.tms.model;

import jakarta.persistence.*;

@Entity
public class TestStep {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int stepNumber;
    private String action;
    private String expectedResult;
    @ManyToOne
    private TestCase testCase;
    // Getters, setters
}
