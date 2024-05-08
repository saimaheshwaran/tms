package com.tools.tms.restcontrollers;

import com.tools.tms.entities.Defect;
import com.tools.tms.repositories.DefectRepository;
import com.tools.tms.services.DefectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefectRestController {

    @Autowired
    DefectService defectService;

    @PostMapping("/bg/add")
    public ResponseEntity<Defect> addDefects(@RequestBody Defect defect) {
        return new ResponseEntity<Defect>(defectService.add(defect), HttpStatus.OK);
    }

    @PostMapping("/bg/update")
    public ResponseEntity <Defect>updateDefects(@RequestBody Defect defect) {
        return new ResponseEntity<Defect>(defectService.update(defect), HttpStatus.OK);
    }

    @GetMapping("/bg/getall")
    public List<Defect> getDefects() {
        return defectService.getAll();
    }
}
