package com.example.Salinas.API.models;

import java.math.BigDecimal;

public class EmployeeActive {
	private String fullName;
    private String taxIdNumber;
    private String email;
    private String contractTypeName;
    private String dateFrom;
    private String dateTo;
    private BigDecimal salaryPerDay;

    // Constructor
    public EmployeeActive(String fullName, String taxIdNumber, String email, String contractTypeName, String dateFrom, String dateTo, BigDecimal salaryPerDay) {
        this.fullName = fullName;
        this.taxIdNumber = taxIdNumber;
        this.email = email;
        this.contractTypeName = contractTypeName;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.salaryPerDay = salaryPerDay;
    }

    // Getters y Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTaxIdNumber() {
        return taxIdNumber;
    }

    public void setTaxIdNumber(String taxIdNumber) {
        this.taxIdNumber = taxIdNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContractTypeName() {
        return contractTypeName;
    }

    public void setContractTypeName(String contractTypeName) {
        this.contractTypeName = contractTypeName;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public BigDecimal getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(BigDecimal salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }
}
