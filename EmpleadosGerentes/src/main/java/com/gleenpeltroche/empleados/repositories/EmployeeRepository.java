package com.gleenpeltroche.empleados.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gleenpeltroche.empleados.models.Employees;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employees, Long> {
	@Query(value="select ger.first_name as ger_name, ger.last_name as ger_lastname, empl.first_name as empl_name, empl.last_name  as empl_lastname from gerencia join employees as ger on ger.id = gerencia.gerente_id join employees as empl on empl.id = gerencia.employee_id", nativeQuery=true)
	List<Object[]> findAllGerentesEmpleados();
	
	@Query(value="select GROUP_CONCAT( CONCAT(empl.first_name, ' ', empl.last_name)) AS empleados, CONCAT(ger.first_name, ' ', ger.last_name) as gerente from gerencia join employees as empl on empl.id = gerencia.employee_id join employees as ger on ger.id = gerencia.gerente_id GROUP BY ger.first_name, ger.last_name", nativeQuery=true)
	List<Object[]> findAllEmpleadosGerente();
	
}
