package com.tools.tms.services;

import com.tools.tms.entities.Defect;
import com.tools.tms.repositories.DefectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DefectService {

    @Autowired
    DefectRepository defectRepository;

    public Defect add(Defect defect) {
        defect.setCreatedAt(Date.from(Instant.now()));
        return defectRepository.save(defect);
    }

    public Defect update(Defect defect) {
        Optional<Defect> temp = defectRepository.findById(defect.getId());
        if(temp.isPresent()) {
            temp.get().setSummary(defect.getSummary());
            temp.get().setDescription(defect.getDescription());
            temp.get().setPriority(defect.getPriority());
            temp.get().setSeverity(defect.getSeverity());
            temp.get().setDetectedBy(defect.getDetectedBy());
            temp.get().setAssignedTo(defect.getAssignedTo());
            temp.get().setStatus(defect.getStatus());
            temp.get().setUpdatedAt(Date.from(Instant.now()));
            return defectRepository.save(defect);
        } else
            return null;
    }

    public List<Defect> getAll() {
        return defectRepository.findAll();
    }

}
