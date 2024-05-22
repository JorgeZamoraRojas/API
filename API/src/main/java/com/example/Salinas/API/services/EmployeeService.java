package com.example.Salinas.API.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Salinas.API.repositories.ContractRepository;
import com.example.Salinas.API.repositories.ContractTypeRepository;
import com.example.Salinas.API.repositories.EmployeeRepository;
import com.example.Salinas.API.models.EmployeeModel;
import com.example.Salinas.API.models.ContractModel;
import com.example.Salinas.API.models.EmployeeActive;

import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ContractRepository contractRepository;
	
	@Autowired
	ContractTypeRepository contractTypeRepository;
	
	//Obtener empleados activos solo Name, LastName email etc...
	public List<EmployeeActive> getActiveEmployees(){
		return employeeRepository.findAll().stream().map(this::mapActive).collect(Collectors.toList());
	}
    public EmployeeActive mapActive(EmployeeModel employee) {
    	System.out.println("Employee ID: "+employee.getEmployeeId());
    	System.out.println("Employee Contract ID: "+employee.getContracts());
    	
    	  ContractModel activeContract = employee.getContracts().stream()
    		        .filter(contract -> contract.getDateTo() != null)
    		        .findFirst()
    		        .orElse(null);    
        
        return new EmployeeActive(
            employee.getName() + " " + employee.getLastName(),
            employee.getTaxIdNumber(),
            employee.getEmail(),
            activeContract != null ? activeContract.getContractType().getName() : null,
            activeContract != null ? activeContract.getDateFrom() : null,
            activeContract != null ? activeContract.getDateTo() : null,
            activeContract != null ? activeContract.getSalaryPerDay() : null
        );
    }
    
	//ObtenerTodos los Empleados
	public List<EmployeeModel> getAllEmployees(){
		return employeeRepository.findAll();
	}
	
	//EndPoint Nuevo Empleado 
	public EmployeeModel addNewEmployee(EmployeeModel employee) {
		return employeeRepository.save(employee);
	}
	
	

}
