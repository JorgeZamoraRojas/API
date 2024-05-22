package com.example.Salinas.API.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Salinas.API.models.ContractModel;
import com.example.Salinas.API.models.EmployeeModel;
import com.example.Salinas.API.repositories.ContractRepository;
import com.example.Salinas.API.repositories.EmployeeRepository;

@Service
public class ContractService {
	@Autowired
	ContractRepository contractRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Transactional
	public ContractModel addNewContract(ContractModel contract) {
		return contractRepository.save(contract);
	}
	
	private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	public ContractModel addContract(Long employeeId, ContractModel contractDetails) {
        EmployeeModel employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado"));

        Optional<ContractModel> activeContract = employee.getContracts().stream()
                .filter(contract -> {
                    if (contract.getDateTo() == null || contract.getDateTo().isEmpty()) {
                        return true;
                    }
                    LocalDate dateTo = LocalDate.parse(contract.getDateTo(), dateFormatter);
                    return dateTo.isAfter(LocalDate.now());
                })
                .findFirst();

        if (activeContract.isPresent()) {
            ContractModel currentContract = activeContract.get();
            currentContract.setDateTo(LocalDate.now().format(dateFormatter));
            contractRepository.save(currentContract);
        }

        contractDetails.setEmployee(employee);
        return contractRepository.save(contractDetails);
    }
}
