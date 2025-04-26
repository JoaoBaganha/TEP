package com.tep.backend.model.dto;

import java.time.LocalDateTime;

public class TokenDTO {

    private Long id;
    private String name;
    private String symbol;
    private String contractAddress;
    private String tokenType;
    private LocalDateTime createdAt;
    private CompanyDTO company;

    public TokenDTO() {
    }

    public TokenDTO(Long id, String name, String symbol, String contractAddress, String tokenType, LocalDateTime createdAt, CompanyDTO company) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.contractAddress = contractAddress;
        this.tokenType = tokenType;
        this.createdAt = createdAt;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }
}
