package com.example.Salinas.API.models;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity //Modelo Real
@Table(name = "Employee") //Nombre Tabla
public class EmployeeModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;

	@Column( length = 13, unique = true)
	private String taxIdNumber;

	@Column(length = 60)
	private String name;

	@Column( length = 120)
	private String lastName;

	@Column(length = 50)
	private String birthDate;

	@Column( length = 60)
	private String email;

	@Column( length = 20)
	private String cellPhone;

	@Column()
	private boolean isActive;

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL, orphanRemoval =true)
	@JsonManagedReference
	private List<ContractModel> contracts= new ArrayList<>();
	
	public List<ContractModel> getContracts() {
		return contracts;
	}

	public void setContracts(List<ContractModel> contracts) {
		this.contracts = contracts;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column()
	private String dateCreated;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(String taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}



	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	

}
