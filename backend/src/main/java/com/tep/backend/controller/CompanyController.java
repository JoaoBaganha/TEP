package com.tep.backend.controller;

import com.tep.backend.model.dto.CompanyDTO;
import com.tep.backend.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/companies")
public class CompanyController {

    @Autowired
    private CompanyService service;

    @GetMapping(value = "/{id}")
    public CompanyDTO findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping
    public List<CompanyDTO> findAll(){
        return service.findAll();
    }

    @PostMapping
    public CompanyDTO insert(@RequestBody CompanyDTO dto){
        return service.insert(dto);
    }
}
