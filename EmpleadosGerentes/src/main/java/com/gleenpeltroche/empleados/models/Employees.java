package com.gleenpeltroche.empleados.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date createdAt;
    private Date updatedAt;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "gerencia", 
        joinColumns = @JoinColumn(name = "employee_id"), 
        inverseJoinColumns = @JoinColumn(name = "gerente_id")
    )
    private List<Employees> employee;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "gerencia", 
        joinColumns = @JoinColumn(name = "gerente_id"), 
        inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private List<Employees> gerente;

	public Employees() {
	}
	public Employees(Long id, String firstName, String lastName, Date createdAt, Date updatedAt,
			List<Employees> employee, List<Employees> gerente) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.employee = employee;
		this.gerente = gerente;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<Employees> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employees> employee) {
		this.employee = employee;
	}
	public List<Employees> getGerente() {
		return gerente;
	}
	public void setGerente(List<Employees> gerente) {
		this.gerente = gerente;
	}

}
