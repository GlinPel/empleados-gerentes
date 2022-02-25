package com.gleenpeltroche.empleados.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gleenpeltroche.empleados.repositories.EmployeeRepository;

@Service
public class ApiService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Object[]> findAllGerentesEmpleados() {
		return employeeRepository.findAllGerentesEmpleados();
	}
	public List<Object[]> findAllEmpleadosGerente() {
		return employeeRepository.findAllEmpleadosGerente();
	}
}

