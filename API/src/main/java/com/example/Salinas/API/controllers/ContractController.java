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
	
    /*Funciona para agregar contratos
     * @PostMapping
    public ResponseEntity<ContractModel> addContract(@RequestParam Long employeeId, @RequestBody ContractModel contractDetails) {
        ContractModel newContract = contractService.addContract(employeeId, contractDetails);
        return ResponseEntity.status(201).body(newContract);
    }
    */
	 @PostMapping
	    public void addContract(@RequestBody ContractRequest request) {
	        contractService.addContract(
	                request.getEmployeeId(),
	                request.getContractTypeId(),
	                request.getDateFrom(),
	                request.getDateTo(),
	                request.getSalaryPerDay()
	        );
	        
	 }
	 class ContractRequest {
		    public Integer getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}
		public Short getContractTypeId() {
			return contractTypeId;
		}
		public void setContractTypeId(Short contractTypeId) {
			this.contractTypeId = contractTypeId;
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
			private Integer employeeId;
		    private Short contractTypeId;
		    private String dateFrom;
		    private String dateTo;
		    private BigDecimal salaryPerDay;

		    // Getters y setters
		}

}
