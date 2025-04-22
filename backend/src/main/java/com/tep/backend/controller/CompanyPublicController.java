package com.tep.backend.controller;

import com.tep.backend.model.dto.CompanyPublicDTO;
import com.tep.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/companies")
public class CompanyPublicController {

    @Autowired
    private CompanyService service;

    @GetMapping("/{id}")
    public CompanyPublicDTO findById(@PathVariable Long id) {
        return service.findPublicById(id);
    }
}
