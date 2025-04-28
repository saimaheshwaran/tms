package com.sm.tms.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class TestRun {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TestInstance testInstance;
    private String result;
    private String comments;
    private LocalDateTime runDate;
    // Getters, setters
}
