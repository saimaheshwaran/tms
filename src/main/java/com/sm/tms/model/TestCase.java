package com.sm.tms.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TestCase {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    @ManyToOne
    private Requirement requirement;
    @OneToMany(mappedBy = "testCase", cascade = CascadeType.ALL)
    private List<TestStep> steps;
    // Getters, setters, constructors
}
