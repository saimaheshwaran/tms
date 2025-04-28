package com.sm.tms.repository;

import com.sm.tms.model.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequirementRepository extends JpaRepository<Requirement, Long> {
    List<Requirement> findByReleaseId(Long releaseId);
}