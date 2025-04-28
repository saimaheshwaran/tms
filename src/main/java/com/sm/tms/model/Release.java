package com.sm.tms.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Release {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(mappedBy = "release")
    private Set<Requirement> requirements;
    @OneToMany(mappedBy = "release")
    private Set<TestCycle> testCycles;
    // Getters, setters
}
