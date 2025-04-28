package com.sm.tms.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    @ManyToOne
    private Release release;
    @OneToMany(mappedBy = "requirement")
    private Set<TestCase> testCases;
    // Getters, setters, constructors
}
