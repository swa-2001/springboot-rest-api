package com.example.employeeapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.repository.EmployeeRepository;
//Validations
//Calculations
//Data Transformation
//Calling multiple repositories if needed
//Contains Business Logic
@Service
public class EmployeeService {
	private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAll() {
        return repo.findAll();
    }

    public Employee getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Employee save(Employee emp) {
        return repo.save(emp);         //repo extends JpaRepository which converts thsi into sql query
    }                                  //INSERT INTO employee (name, department, salary) VALUES (...);

    public Employee update(Long id, Employee newEmp) {
        Employee e = repo.findById(id).orElse(null);
        if (e == null) return null;

        e.setName(newEmp.getName());
        e.setDepartment(newEmp.getDepartment());
        e.setSalary(newEmp.getSalary());

        return repo.save(e);
    }

    public String delete(Long id) {
        repo.deleteById(id);
        return "Employee deleted";
    }
}
