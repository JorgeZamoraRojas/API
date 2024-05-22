package com.example.Salinas.API.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Salinas.API.models.EmployeeModel;
import com.example.Salinas.API.models.ContractModel;
import com.example.Salinas.API.models.EmployeeActive;
import com.example.Salinas.API.services.ContractService;
import com.example.Salinas.API.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	ContractService contractService;
	
	@GetMapping
	public List<EmployeeActive> getActiveEmployees(){
		return employeeService.getActiveEmployees();
	}
	
	
	/*@GetMapping("/query")
	public ArrayList<EmployeeModel> obtenerPorActivo(@RequestParam("active") boolean isActive){
		return this.employeeService.obtenerPorActivo(isActive);
	}
	*7
	
	/*
	 * @GetMapping("/active")//Obtener todos los Empleados ACTIVOS public
	 * ResponseEntity<List<EmployeeModel>> getActiveEmployees(){ List<EmployeeModel>
	 * employees=employeeService.getAllActiveEmployees(); return
	 * ResponseEntity.ok(employees); }
	 */

	@GetMapping("/AllEmployees") // Obtener todos los Empleados
	public ResponseEntity<List<EmployeeModel>> getEmployees() {
		List<EmployeeModel> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	

	//Endpint para crear nuevo empleado
	@PostMapping("/newEmployee")
	public ResponseEntity<EmployeeModel> addNewEmployee(@RequestBody EmployeeModel employee) {		
		EmployeeModel saveEmployee = employeeService.addNewEmployee(employee);
		return ResponseEntity.status(201).body(saveEmployee);
	}	
}
