package com.example.employeeapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity                                                //Spring Boot + JPA auto-creates tables for you	
public class Employee {
	@Id                                                  // specifies that id is the primary key for this table  
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generates id , we need not give the value for id to table
    private Long id;

    private String name;
    private String department;
    private double salary;

    public Employee() {}

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
    
}
