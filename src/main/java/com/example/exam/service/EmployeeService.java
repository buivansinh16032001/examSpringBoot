package com.example.exam.service;

import com.example.exam.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee createEmployee(Employee employee);
}
