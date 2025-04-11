package com.tep.backend.controller;

import com.tep.backend.model.dto.CompanyDTO;
import com.tep.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(value = "/companies")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @PostMapping
    public CompanyDTO insert(@RequestBody CompanyDTO dto){
        return service.insert(dto);
    }
}
