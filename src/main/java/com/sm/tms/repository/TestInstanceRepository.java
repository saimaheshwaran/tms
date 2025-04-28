package com.sm.tms.repository;

import com.sm.tms.model.TestInstance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestInstanceRepository extends JpaRepository<TestInstance, Long> {
    List<TestInstance> findByTestCycleId(Long testCycleId);
}

