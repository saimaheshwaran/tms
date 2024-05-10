package com.tools.tms.controllers;

import com.tools.tms.entities.Defect;
import com.tools.tms.services.DefectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Controller
public class HomeController {

    @Autowired
    DefectService defectService;

    @GetMapping("/")
    public String homePage(Model model) {
        Object[] result = new RestTemplate().getForObject("http://localhost/bg/getall", Object[].class);
        System.out.println("result = " + result);
        System.out.println("service = " + defectService.getAll());
//        result = defectService.getAll();
        model.addAttribute("alldefects", result);
        return "index";
    }

}
