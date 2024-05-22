package com.example.Salinas.API.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Salinas.API.models.ContractModel;
import com.example.Salinas.API.models.EmployeeModel;

public interface ContractRepository extends JpaRepository<ContractModel, Long> {
	List<ContractModel> findByEmployeeAndDateToIsNull(EmployeeModel employee);
}
