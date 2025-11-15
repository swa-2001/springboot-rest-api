package com.example.employeeapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.employeeapi.model.Employee;
import com.example.employeeapi.service.EmployeeService;

//Calls Service layer
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Employee getOne(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        return service.update(id, employee);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }
    
    @GetMapping("/name/{name}")
    public Employee getOne(@PathVariable String name) {
        return service.getByName(name);
    }
}
