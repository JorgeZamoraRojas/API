package com.example.Salinas.API.models;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity //Modelo Real
@Table(name="Contract") //Nombre Tabla
public class ContractModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long contractId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	@JsonBackReference
	private EmployeeModel employee;
	

	@ManyToOne()
	@JoinColumn(name = "contract_type_id")
	private ContractTypeModel contractType;

	@Column()
	private String dateFrom;

	@Column()
	private String dateTo;

	@Column(precision = 10, scale = 2)
	private BigDecimal salaryPerDay;

	@Column()
	private boolean isActive;

	@Column()
	private String dateCreated;

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public EmployeeModel getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeModel employee) {
		this.employee = employee;
	}

	public ContractTypeModel getContractType() {
		return contractType;
	}

	public void setContractType(ContractTypeModel contractType) {
		this.contractType = contractType;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}


}
