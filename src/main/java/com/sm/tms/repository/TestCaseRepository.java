package com.sm.tms.repository;

import com.sm.tms.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestCaseRepository extends JpaRepository<TestCase, Long> {
    List<TestCase> findByRequirementId(Long requirementId);
}
