package com.example.Salinas.API.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Salinas.API.models.ContractModel;
import com.example.Salinas.API.services.ContractService;

@RestController
@RequestMapping("/contracts")
public class ContractController {
	@Autowired
	ContractService contractService;
	
    //Funciona para agregar contratos
    @PostMapping
    public ResponseEntity<ContractModel> addContract(@RequestParam Long employeeId, @RequestBody ContractModel contractDetails) {
        ContractModel newContract = contractService.addContract(employeeId, contractDetails);
        return ResponseEntity.status(201).body(newContract);
    }
  


}
