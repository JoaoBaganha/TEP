package com.tep.backend.service;

import com.tep.backend.model.dto.CompanyDTO;
import com.tep.backend.model.entity.Company;
import com.tep.backend.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository repository;

    @Transactional(readOnly = true)
    public CompanyDTO findById(Long id){
        Optional<Company> result = repository.findById(id);
        return new CompanyDTO(result.get());
    }

    @Transactional(readOnly = true)
    public List<CompanyDTO> findAll(){
        List<Company> result = repository.findAll();
        return result.stream().map(CompanyDTO::new).toList();
    }

    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }

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
