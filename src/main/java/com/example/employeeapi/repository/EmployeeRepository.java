package com.example.employeeapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employeeapi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	Employee findByName(String name);
}
//What JPA does
//Converts Java objects → database rows
//Converts rows → Java objects
//Creates tables automatically
//Executes SQL queries behind the scenes