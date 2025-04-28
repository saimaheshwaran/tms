package com.sm.tms.controller;

import com.sm.tms.model.Requirement;
import com.sm.tms.service.TestManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requirements")
public class RequirementController {

    @Autowired
    private TestManagementService service;

    @PostMapping
    public ResponseEntity<Requirement> createRequirement(@RequestBody Requirement requirement) {
        return ResponseEntity.ok(service.createRequirement(requirement));
    }

    @GetMapping("/by-release/{releaseId}")
    public ResponseEntity<List<Requirement>> getRequirementsByRelease(@PathVariable Long releaseId) {
        return ResponseEntity.ok(service.getRequirementsByRelease(releaseId));
    }
}
