package com.tools.tms.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

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

    @JsonProperty("bg_createdOn")
    @Column(name = "bug_createdOn")
    private Date createdOn;

    @JsonProperty("bg_updatedOn")
    @Column(name = "bug_updatedOn")
    private Date updatedOn;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Defect defect)) return false;
        return Objects.equals(getId(), defect.getId()) && Objects.equals(getSummary(), defect.getSummary()) && Objects.equals(getDescription(), defect.getDescription()) && Objects.equals(getPriority(), defect.getPriority()) && Objects.equals(getSeverity(), defect.getSeverity()) && Objects.equals(getStatus(), defect.getStatus()) && Objects.equals(getDetectedBy(), defect.getDetectedBy()) && Objects.equals(getAssignedTo(), defect.getAssignedTo()) && Objects.equals(getCreatedOn(), defect.getCreatedOn()) && Objects.equals(getUpdatedOn(), defect.getUpdatedOn());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSummary(), getDescription(), getPriority(), getSeverity(), getStatus(), getDetectedBy(), getAssignedTo(), getCreatedOn(), getUpdatedOn());
    }
}
