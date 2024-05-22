package com.example.Salinas.API.models;

import jakarta.persistence.*;

@Entity //Modelo Real
@Table(name = "ContractType") //Nombre Tabla
public class ContractTypeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short contractTypeId;
	
	@Column(length = 80)
    private String name;

    @Column(length = 255)
    private String description;

    @Column()
    private boolean isActive;

    @Column()
    private String dateCreated;

	public Short getContractTypeId() {
		return contractTypeId;
	}

	public void setContractTypeId(Short contractTypeId) {
		this.contractTypeId = contractTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
