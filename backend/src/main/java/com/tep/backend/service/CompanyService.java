package com.tep.backend.service;

import com.tep.backend.model.dto.CompanyDTO;
import com.tep.backend.model.entity.Company;
import com.tep.backend.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    @Transactional
    public CompanyDTO insert(CompanyDTO dto){
        Company entity = new Company();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCnpj(dto.getCnpj());
        entity = repository.save(entity);
        return new CompanyDTO(entity);
    }
}
