package com.sm.tms.service;

import com.sm.tms.model.Requirement;
import com.sm.tms.model.TestCase;
import com.sm.tms.repository.RequirementRepository;
import com.sm.tms.repository.TestCaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TestManagementService {

    @Autowired
    private RequirementRepository requirementRepo;
    @Autowired
    private TestCaseRepository testCaseRepo;
    // Other repositories

    // Requirement methods
    public Requirement createRequirement(Requirement requirement) {
        return requirementRepo.save(requirement);
    }

    public List<Requirement> getRequirementsByRelease(Long releaseId) {
        return requirementRepo.findByReleaseId(releaseId);
    }

    // Test Case methods
    public TestCase createTestCase(TestCase testCase) {
        return testCaseRepo.save(testCase);
    }

    // Similar methods for other entities
}
