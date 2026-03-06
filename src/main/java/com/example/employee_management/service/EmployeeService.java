package com.example.employee_management.service;

import org.springframework.data.domain.Page;

import com.example.employee_management.model.Employee;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Page<Employee> getAllEmployees(int page, int size, String sortBy, String direction);

    Employee getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);
}
