package com.sm.tms.repository;

import com.sm.tms.model.Defect;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DefectRepository extends JpaRepository<Defect, Long> {
    List<Defect> findByStatus(String status);
}
