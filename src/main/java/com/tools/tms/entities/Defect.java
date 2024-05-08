package com.tools.tms.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Objects;

@Builder
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
@Entity @Table(name = "bug")
public class Defect {

    @Id
    @SequenceGenerator(name="bug_seq_gen", sequenceName = "bug_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bug_seq_gen")
    @JsonProperty("bg_id")
    @Column(name = "bug_id")
    @Setter(AccessLevel.NONE)
    private Integer id;

    @JsonProperty("bg_summary")
    @Column(name = "bug_summary", nullable = false)
    private String summary;

    @JsonProperty("bg_description")
    @Column(name = "bug_description")
    private String description;

    @JsonProperty("bg_priority")
    @Column(name = "bug_priority", nullable = false)
    private String priority;

    @JsonProperty("bg_severity")
    @Column(name = "bug_severity", nullable = false)
    private String severity;

    @JsonProperty("bg_status")
    @Column(name = "bug_status", nullable = false)
    private String status;

    @JsonProperty("bg_detectedBy")
    @Column(name = "bug_detectedBy", nullable = false)
    private String detectedBy;

    @JsonProperty("bg_assignedTo")
    @Column(name = "bug_assignedTo", nullable = false)
    private String assignedTo;

    @JsonProperty("bg_created")
    @Column(name = "bug_created")
    private Date createdAt;

    @JsonProperty("bg_updated")
    @Column(name = "bug_updated")
    private Date updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Defect defect)) return false;
        return Objects.equals(id, defect.id) && Objects.equals(summary, defect.summary) && Objects.equals(description, defect.description) && Objects.equals(priority, defect.priority) && Objects.equals(severity, defect.severity) && Objects.equals(status, defect.status) && Objects.equals(detectedBy, defect.detectedBy) && Objects.equals(assignedTo, defect.assignedTo);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
