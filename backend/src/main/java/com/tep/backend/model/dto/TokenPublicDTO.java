package com.tep.backend.model.dto;

import com.tep.backend.model.entity.Token;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class TokenPublicDTO {

    private Long id;
    private String name;
    private String symbol;
    private String productName;
    private String productImageUrl;
    private String companyName;
    private String contractAddress;

    private BigInteger totalSupply;
    private BigDecimal price;
    private List<TransferDTO> transferHistory = new ArrayList<>();

    public TokenPublicDTO() {
    }

    public TokenPublicDTO(Token entity) {
        id = entity.getId();
        name = entity.getName();
        symbol = entity.getSymbol();
        productName = entity.getProductName();
        productImageUrl = entity.getProductImageUrl();
        companyName = entity.getCompany().getName();
        contractAddress = entity.getContractAddress();
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    public BigInteger getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(BigInteger totalSupply) {
        this.totalSupply = totalSupply;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<TransferDTO> getTransferHistory() {
        return transferHistory;
    }

    public void setTransferHistory(List<TransferDTO> transferHistory) {
        this.transferHistory = transferHistory;
    }
}
