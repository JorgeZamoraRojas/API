package com.example.Salinas.API.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Salinas.API.models.EmployeeModel;

public interface EmployeeRepository extends  JpaRepository<EmployeeModel, Long>{
	//Optional<EmployeeModel>findByTaxIdNumber(String taxtIdNumber);
	//public abstract ArrayList<EmployeeModel> findByIsActive(boolean isActive);
	//EmployeeModel findByTaxIdNumber(String taxIdNumber);
}
