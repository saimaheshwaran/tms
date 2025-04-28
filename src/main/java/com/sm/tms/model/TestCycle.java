package com.sm.tms.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class TestCycle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    private Release release;
    @OneToMany(mappedBy = "testCycle")
    private Set<TestInstance> testInstances;
    // Getters, setters
}
