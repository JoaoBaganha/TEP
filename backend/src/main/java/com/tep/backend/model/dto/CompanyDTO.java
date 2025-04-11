package com.tep.backend.model.dto;

import com.tep.backend.model.entity.Company;

public class CompanyDTO {
    private Long id;
    private String name;
    private String cnpj;

    public CompanyDTO() {
    }

    public CompanyDTO(Company entity) {
        id = entity.getId();;
        name = entity.getName();
        cnpj = entity.getCnpj();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCnpj() {
        return cnpj;
    }
}
