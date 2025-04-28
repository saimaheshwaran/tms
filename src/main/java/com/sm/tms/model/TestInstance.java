package com.sm.tms.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TestInstance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TestCase testCase;
    @ManyToOne
    private TestCycle testCycle;
    private String status;
    private String executedBy;
    private LocalDateTime executedOn;
    // Getters, setters
}
