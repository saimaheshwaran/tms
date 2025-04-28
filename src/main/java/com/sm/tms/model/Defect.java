package com.sm.tms.model;

import jakarta.persistence.*;

@Entity
public class Defect {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String severity;
    private String status;
    @ManyToOne
    private TestRun testRun;
    // Getters, setters
}
